package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CourseController implements Controller {

	@Override
	public void handle(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		resp.setStatus(HttpServletResponse.SC_OK);
		resp.getWriter().println("<html><body><p>200</p></body></html>");
	}

}
