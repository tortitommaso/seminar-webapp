package com;

import static org.junit.Assert.*;

import org.junit.Test;

import com.controller.Controller;
import com.controller.CourseController;
import com.controller.NotFoundController;

public class RoutesTest extends Routes {

	@Test
	public void return404WhenNotFound() {
		Controller notFoundController = new Routes().find("path");
		assertEquals(notFoundController.getClass(), NotFoundController.class);
	}
	
	@Test
	public void coursePathCase() throws Exception {		
		Controller courseController = new Routes().find("course");
		assertEquals(courseController.getClass(), CourseController.class);
	}

}
