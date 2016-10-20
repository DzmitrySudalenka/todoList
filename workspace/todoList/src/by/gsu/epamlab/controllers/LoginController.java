package by.gsu.epamlab.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import by.gsu.epamlab.Constants;
import by.gsu.epamlab.exceptions.DaoException;
import by.gsu.epamlab.exceptions.ValidationException;
import by.gsu.epamlab.ifaces.AbstractBaseController;
import by.gsu.epamlab.ifaces.IUserDAO;
import by.gsu.epamlab.model.beans.User;
import by.gsu.epamlab.model.factories.UserFactory;

public class LoginController extends AbstractBaseController {
	private static final long serialVersionUID = 1L;
	protected void performTask(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String login = request.getParameter(Constants.KEY_LOGIN);
		String password = request.getParameter(Constants.KEY_PASSWORD);
		try {
			checkInput(login, password);
			IUserDAO userDAO = UserFactory.getClassFromFactory();
			User user = userDAO.getUser(login.trim(), password);
			HttpSession session = request.getSession();
			session.setAttribute(Constants.KEY_USER, user);
			redirect(Constants.JUMP_CONTROLLER_TASKS_TODAY, request, response);
		} catch (ValidationException | DaoException e) {
			jumpReport(e.getMessage(), Constants.JUMP_VIEW_LOGIN, 
					request, response);
		}
	}
	private static void checkInput(String login, String password) 
			throws ValidationException {
		if(Constants.VALUE_EMPTY.equals(login) || Constants.VALUE_EMPTY.equals(password)) {
			throw new ValidationException(Constants.REPORT_LOGIN_OR_PASSWORD_ABSENT);
		}
	}
}
