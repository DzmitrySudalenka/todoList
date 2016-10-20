package by.gsu.epamlab.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import by.gsu.epamlab.Constants;
import by.gsu.epamlab.exceptions.DaoException;
import by.gsu.epamlab.ifaces.AbstractBaseController;
import by.gsu.epamlab.ifaces.ITaskDAO;
import by.gsu.epamlab.model.beans.Task;
import by.gsu.epamlab.model.beans.TaskSection;
import by.gsu.epamlab.model.beans.User;
import by.gsu.epamlab.model.factories.TaskFactory;

public class TasksController extends AbstractBaseController {
	private static final long serialVersionUID = 1L;
	protected void performTask(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
    	HttpSession session = request.getSession();
    	try {
    		TaskSection taskSection;
    		if (request.getParameterMap().containsKey(Constants.KEY_SECTION)) {
    			String sectionId = request.getParameter(Constants.KEY_SECTION);
    			taskSection = TaskSection.getTaskSectionById(sectionId);
    			session.setAttribute(Constants.KEY_TASK_SECTION, taskSection);
    		} else {
    			taskSection = (TaskSection)session.getAttribute(Constants.KEY_TASK_SECTION);
    		}
	    	User user = (User)session.getAttribute(Constants.KEY_USER);
	    	ITaskDAO taskDAO = TaskFactory.getClassFromFactory();
	    	List<Task> tasks = taskDAO.getTasks(user.getId(), taskSection);
    		request.setAttribute(Constants.KEY_TASKS, tasks);
			jump(Constants.JUMP_VIEW_TASKS, request, response);
		} catch (DaoException e) {
			jumpReport(e.getMessage(), Constants.JUMP_VIEW_TASKS, request, response);
		}
	}
}
