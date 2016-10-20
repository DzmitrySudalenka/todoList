package by.gsu.epamlab.ifaces;

import java.io.File;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.gsu.epamlab.Constants;
import by.gsu.epamlab.exceptions.DaoException;
import by.gsu.epamlab.model.factories.TaskFactory;

public abstract class AbstractBaseController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
	    performTask(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
	    performTask(request, response);
	}
	abstract protected void performTask(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException;
	protected void jump(String url, HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
		rd.forward(request, response);
	}
	protected void jumpReport(String message, String url, HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute(Constants.KEY_REPORT_MESSAGE, message);
		jump(url, request, response);
	}
	protected void redirect(String url, HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect(request.getContextPath() + url);
	}
	protected String getFilePath() {
		return getServletContext().getRealPath(Constants.PATH_DEFAULT) 
			+ Constants.FILE_FOLDER_NAME;
	}
	protected String getFullFileName(int userId, int taskId, String fileName) {
		String filePath = getFilePath() + Constants.FILE_PATH_SEPARATOR;
		String fileNameWithIdsFirst = userId + Constants.FILE_NAME_SEPARATOR 
			+ taskId + Constants.FILE_NAME_SEPARATOR + fileName;
		return filePath + fileNameWithIdsFirst;
	}
	protected void deleteTaskFile(int userId, int taskId) 
			throws DaoException, IOException {
		ITaskDAO taskDAO = TaskFactory.getClassFromFactory();
		String fileName = taskDAO.getTaskFileName(taskId);
		String fullFileName = getFullFileName(userId, taskId, fileName);
        File fileToDelete = new File(fullFileName);
        fileToDelete.delete();
        taskDAO.deleteTaskFile(taskId);
	}
}