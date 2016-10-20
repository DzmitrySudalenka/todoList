package by.gsu.epamlab.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import by.gsu.epamlab.Constants;
import by.gsu.epamlab.exceptions.DaoException;
import by.gsu.epamlab.exceptions.ValidationException;
import by.gsu.epamlab.ifaces.AbstractBaseController;
import by.gsu.epamlab.ifaces.ITaskDAO;
import by.gsu.epamlab.model.beans.File;
import by.gsu.epamlab.model.beans.Task;
import by.gsu.epamlab.model.beans.TaskSection;
import by.gsu.epamlab.model.beans.User;
import by.gsu.epamlab.model.factories.TaskFactory;

public class TasksDeleteController extends AbstractBaseController {
	private static final long serialVersionUID = 1L;
	private ITaskDAO taskDAO = TaskFactory.getClassFromFactory();
	protected void performTask(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		User user = (User)session.getAttribute(Constants.KEY_USER);
		int userId = user.getId();
		String delete = request.getParameter(Constants.KEY_DELETE);
		try {
			if (Constants.VALUE_SELECTED.equals(delete)) {
				String[] taskIds = request.getParameterValues(Constants.KEY_TASK_IDS);
				checkTaskIds(taskIds);
				deleteTasks(userId, taskIds);
			} else {
				emptyRecycleBin(userId);
			}
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
	protected void deleteTask(int userId, Task task) 
			throws DaoException, IOException {
		int taskId = task.getId();
		if (task.isHaveFile()) {
			deleteTaskFile(userId, taskId);
			File taskFile = task.getFile();
			int taskFileId = taskFile.getId();
			taskDAO.deleteTaskFile(taskFileId);
		}
        taskDAO.deleteTask(taskId);
	}
	protected void deleteTasks(int userId, List<Task> tasks) 
			throws DaoException, IOException {
		for (Task task : tasks) {
			deleteTask(userId, task);
		}
	}
	protected void deleteTasks(int userId, String[] taskIds) 
			throws DaoException, IOException {
		List<Task> tasks = taskDAO.getTasks(userId, taskIds);
		deleteTasks(userId, tasks);
	}
	protected void emptyRecycleBin(int userId) 
			throws DaoException, IOException {
		TaskSection taskSection = TaskSection.RECYCLE_BIN;
		List<Task> tasks = taskDAO.getTasks(userId, taskSection);
		deleteTasks(userId, tasks);
	}
}
