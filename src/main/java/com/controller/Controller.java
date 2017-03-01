package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Controller {

	void handle(HttpServletRequest req, HttpServletResponse resp) throws Exception;

}
