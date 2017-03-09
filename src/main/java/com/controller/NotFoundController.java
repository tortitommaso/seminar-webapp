package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.view.ErrorView;

public class NotFoundController implements Controller {

	private final Exception _exception;

	public NotFoundController(Exception exception) {
		_exception = exception;
	}

	public void handle(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		req.toString();
		resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
		resp.getWriter().println(new ErrorView().creationForm(_exception));
	}

}
