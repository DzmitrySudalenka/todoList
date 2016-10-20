package by.gsu.epamlab.controllers;

import java.io.IOException;
import java.util.Date;
import java.text.ParseException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import by.gsu.epamlab.Constants;
import by.gsu.epamlab.exceptions.DaoException;
import by.gsu.epamlab.exceptions.ValidationException;
import by.gsu.epamlab.ifaces.AbstractBaseController;
import by.gsu.epamlab.ifaces.ITaskDAO;
import by.gsu.epamlab.model.beans.TaskSection;
import by.gsu.epamlab.model.beans.User;
import by.gsu.epamlab.model.factories.TaskFactory;

public class TaskAddController extends AbstractBaseController {
	private static final long serialVersionUID = 1L;
	protected void performTask(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException{
    	HttpSession session = request.getSession();
    	TaskSection taskSection = (TaskSection)session.getAttribute(Constants.KEY_TASK_SECTION);
    	if (request.getParameterMap().containsKey(Constants.KEY_DESCRIPTION)) {
    		String description = request.getParameter(Constants.KEY_DESCRIPTION);
    		try {
        		checkDescription(description);
        		String strDate;
        		if (taskSection.isSomeday()) {
        			strDate = request.getParameter(Constants.KEY_DATE);
        		} else {
        			strDate = taskSection.getSectionDate();
        		}
        		Date date = stringToDate(strDate);
        		java.sql.Date sqlDate = new java.sql.Date(date.getTime());
    	    	User user = (User)session.getAttribute(Constants.KEY_USER);
    			ITaskDAO taskDAO = TaskFactory.getClassFromFactory();
    			taskDAO.addTask(user.getId(), description, sqlDate);
    			redirect(Constants.JUMP_CONTROLLER_TASKS, request, response);
    		} catch (ValidationException | DaoException e) {
    			setDefaultDate(taskSection, request);
    			jumpReport(e.getMessage(), Constants.JUMP_VIEW_TASK_ADD, 
    					request, response);
    		}
    	} else {
    		setDefaultDate(taskSection, request);
    		jump(Constants.JUMP_VIEW_TASK_ADD, request, response);
    	}
	}
	private void checkDescription(String description) throws ValidationException {
		if (Constants.VALUE_EMPTY.equals(description)) {
			throw new ValidationException(Constants.REPORT_DESCRIPTION_EMPTY);
		}
	}
	private static Date stringToDate(String stringDate) throws ValidationException {
		if(Constants.VALUE_EMPTY.equals(stringDate)) {
			throw new ValidationException(Constants.REPORT_DATE_NO);
		}
		try {
			return Constants.DATE_FORMAT.parse(stringDate);
		} catch (ParseException e) {
			throw new ValidationException(Constants.REPORT_DATE_WRONG_FORMAT);
		}
	}
	private static void setDefaultDate(TaskSection taskSection, HttpServletRequest request) {
		if (taskSection.isSomeday()) {
			Date todaysDate = new Date();
			String strDefaultDate = Constants.DATE_FORMAT.format(todaysDate);
			request.setAttribute(Constants.KEY_DATE_DEFAULT, strDefaultDate);
		}
	}
}
