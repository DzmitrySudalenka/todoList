package by.gsu.epamlab.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import by.gsu.epamlab.Constants;
import by.gsu.epamlab.exceptions.DaoException;
import by.gsu.epamlab.ifaces.AbstractBaseController;
import by.gsu.epamlab.model.beans.User;

public class TaskFileDeleteController extends AbstractBaseController {
	private static final long serialVersionUID = 1L;
	protected void performTask(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		String strTaskId = request.getParameter(Constants.KEY_TASK_ID);
		int taskId = Integer.parseInt(strTaskId);
		User user = (User)session.getAttribute(Constants.KEY_USER);
		int userId = user.getId();
		try {
			deleteTaskFile(userId, taskId);
            redirect(Constants.JUMP_CONTROLLER_TASKS, request, response);
		} catch (DaoException e) {
			jumpReport(e.getMessage(), Constants.JUMP_CONTROLLER_TASKS, 
					request, response);
		}
	}
}
