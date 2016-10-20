package by.gsu.epamlab.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.gsu.epamlab.Constants;
import by.gsu.epamlab.exceptions.DaoException;
import by.gsu.epamlab.exceptions.ValidationException;
import by.gsu.epamlab.ifaces.AbstractBaseController;
import by.gsu.epamlab.ifaces.ITaskDAO;
import by.gsu.epamlab.model.beans.TaskStatus;
import by.gsu.epamlab.model.factories.TaskFactory;

public class TasksChangeStatusController extends AbstractBaseController {
	private static final long serialVersionUID = 1L;
	protected void performTask(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String strNewTasksStatus = request.getParameter(Constants.KEY_NEW_STATUS);
		TaskStatus newTasksStatus = TaskStatus.getTaskStatusById(strNewTasksStatus);
		String[] taskIds = request.getParameterValues(Constants.KEY_TASK_IDS);
		try {
			checkTaskIds(taskIds);
			ITaskDAO taskDAO = TaskFactory.getClassFromFactory();
			taskDAO.changeTaskStatuses(taskIds, newTasksStatus);
			redirect(Constants.JUMP_CONTROLLER_TASKS, request, response);
		} catch (ValidationException | DaoException e) {
			jumpReport(e.getMessage(), Constants.JUMP_CONTROLLER_TASKS, 
					request, response);
		}
	}
	private void checkTaskIds(String[] taskIds) throws ValidationException {
		if (taskIds == null) {
			throw new ValidationException(Constants.REPORT_TASKS_NOT_SELECTED);
		}
	}
}
