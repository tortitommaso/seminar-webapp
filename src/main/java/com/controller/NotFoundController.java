package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NotFoundController implements Controller {

	@Override
	public void handle(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
		resp.getWriter().println("<html><body><p>404</p></body></html>");
	}

}
