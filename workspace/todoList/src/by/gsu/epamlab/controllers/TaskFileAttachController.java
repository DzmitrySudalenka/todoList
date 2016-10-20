package by.gsu.epamlab.controllers;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FilenameUtils;

import by.gsu.epamlab.Constants;
import by.gsu.epamlab.exceptions.ValidationException;
import by.gsu.epamlab.ifaces.AbstractBaseController;
import by.gsu.epamlab.ifaces.ITaskDAO;
import by.gsu.epamlab.model.beans.User;
import by.gsu.epamlab.model.factories.TaskFactory;

public class TaskFileAttachController extends AbstractBaseController {
	private static final long serialVersionUID = 1L;
	protected void performTask(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		boolean isMultipart = ServletFileUpload.isMultipartContent(request);
		if (isMultipart) {
			User user = (User)session.getAttribute(Constants.KEY_USER);
			int userId = user.getId();
			int taskId = (int) session.getAttribute(Constants.KEY_TASK_ID);
		    FileItemFactory factory = new DiskFileItemFactory();
		    ServletFileUpload upload = new ServletFileUpload(factory);
		    try {
		        List<FileItem> items = upload.parseRequest(request);
		        Iterator<FileItem> iterator = items.iterator();
		        while (iterator.hasNext()) {
		            FileItem item = (FileItem) iterator.next();
		            if (!item.isFormField()) {
		                String fileName = item.getName();
		                checkFileName(fileName);
		                fileName = FilenameUtils.getName(fileName);
		                File path = new File(getFilePath());
		                if (!path.exists()) {
		                    path.mkdirs();
		                }
		                String fullFileName = getFullFileName(userId, taskId, fileName);
		                File uploadedFile = new File(fullFileName);
		                item.write(uploadedFile);
		                ITaskDAO taskDAO = TaskFactory.getClassFromFactory();
		    			taskDAO.addTaskFile(taskId, fileName);
		    			session.removeAttribute(Constants.KEY_TASK_ID);
		    			redirect(Constants.JUMP_CONTROLLER_TASKS, request, response);
		            }
		        }
		    } catch (Exception e) {
		    	jumpReport(e.getMessage(), Constants.JUMP_VIEW_TASK_FILE_ATTACH, 
    					request, response);
		    } 
		} else {
			String strTaskId = request.getParameter(Constants.KEY_TASK_ID);
			int taskId = Integer.parseInt(strTaskId);
			session.setAttribute(Constants.KEY_TASK_ID, taskId);
			jump(Constants.JUMP_VIEW_TASK_FILE_ATTACH, request, response);
		}
	}
	private void checkFileName(String fileName) throws ValidationException {
		if (Constants.VALUE_EMPTY.equals(fileName)) {
			throw new ValidationException(Constants.REPORT_FILE_NOT_SELECTED);
		}
	}
}
