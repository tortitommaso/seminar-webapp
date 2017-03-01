package com;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.controller.Controller;

public class Servlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
		Controller controller = new Routes().find(req.getRequestURI());
		try {
			controller.handle(req, resp);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
