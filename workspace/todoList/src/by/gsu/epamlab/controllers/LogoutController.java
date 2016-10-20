package by.gsu.epamlab.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.gsu.epamlab.Constants;
import by.gsu.epamlab.ifaces.AbstractBaseController;

public class LogoutController extends AbstractBaseController {
	private static final long serialVersionUID = 1L;
	protected void performTask(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.getSession().invalidate();
        redirect(Constants.JUMP_VIEW_MAIN, request, response);
	}
}
