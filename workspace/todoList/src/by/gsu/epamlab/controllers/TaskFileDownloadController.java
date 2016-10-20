package by.gsu.epamlab.controllers;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import by.gsu.epamlab.Constants;
import by.gsu.epamlab.exceptions.DaoException;
import by.gsu.epamlab.ifaces.AbstractBaseController;
import by.gsu.epamlab.ifaces.ITaskDAO;
import by.gsu.epamlab.model.beans.User;
import by.gsu.epamlab.model.factories.TaskFactory;

public class TaskFileDownloadController extends AbstractBaseController {
	private static final long serialVersionUID = 1L;
	protected void performTask(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String strTaskId = request.getParameter(Constants.KEY_TASK_ID);
		int taskId = Integer.parseInt(strTaskId);
		User user = (User)session.getAttribute(Constants.KEY_USER);
		int userId = user.getId();
		try {
			ITaskDAO taskDAO = TaskFactory.getClassFromFactory();
			String fileName = taskDAO.getTaskFileName(taskId);
			String fileNameForHeader = 
				new String(fileName.getBytes(Constants.CHARSET_CP1251), 
				Constants.CHARSET_CP1252);
			response.setHeader(Constants.KEY_CONTENT_DISPOSITION, 
				Constants.VALUE_ATTACHMENT + fileNameForHeader);
			String fullFileName = getFullFileName(userId, taskId, fileName);
			OutputStream out = response.getOutputStream();
			FileInputStream in = new FileInputStream(fullFileName);
			byte[] buffer = new byte[Constants.FILE_BUFFER_SIZE];
			int length;
			while ((length = in.read(buffer)) > 0){
			    out.write(buffer, 0, length);
			}
			in.close();
			out.flush();
		} catch (DaoException e) {
			jumpReport(e.getMessage(), Constants.JUMP_CONTROLLER_TASKS, 
					request, response);
		}
	}
}
