package com.controller;

import java.io.PrintWriter;
import java.io.StringWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NotFoundController implements Controller {

	private final Exception _exception;

	public NotFoundController(Exception exception) {
		_exception = exception;
	}

	public void handle(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		_exception.printStackTrace(pw);
		String stackTrace = sw.toString().replaceAll("\n", "<br>");
		req.toString();
		resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
		resp.getWriter().println("<html><body><p>404!</p><p>"+stackTrace+"</p></body></html>");
	}

}
