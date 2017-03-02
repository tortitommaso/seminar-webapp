package com;

import java.lang.reflect.Method;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.controller.Controller;
import com.controller.NotFoundController;

public class Servlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
		findAndExecuteAction(req, resp, RequestMethod.GET);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
		findAndExecuteAction(req, resp, RequestMethod.POST);
	}

	private void findAndExecuteAction(HttpServletRequest req, HttpServletResponse resp, RequestMethod requestMethod) {
		Routes routes = new Routes();
		Controller controller = routes.findController(req.getRequestURI());
		try {
			String action = routes.findAction(req.getRequestURI());
			Method method = controller.getClass().getDeclaredMethod(
					action, 
					HttpServletRequest.class, HttpServletResponse.class, RequestMethod.class);
			method.invoke(controller, req, resp, requestMethod);
		} catch (Exception e) {
			try {
				new NotFoundController().handle(req, resp);
			} catch (Exception e1) {
				throw new RuntimeException(e1);
			}
		}
	}
}
