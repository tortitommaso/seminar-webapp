package com;

import com.controller.Controller;
import com.controller.CourseController;
import com.controller.NotFoundController;

public class Routes {

	public Controller find(String path) {
		if(path.contains("course"))
			return new CourseController();
		return new NotFoundController();
	}

}