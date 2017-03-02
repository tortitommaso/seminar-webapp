package com;

import com.controller.Controller;
import com.controller.CourseController;
import com.controller.NotFoundController;

public class Routes {

	public Controller findController(String path) {
		if(path.contains("course"))
			return new CourseController();
		return new NotFoundController();
	}

	public String findAction(String requestURI) {
		String action = requestURI.split("/")[2];
		return action;
	}

}
