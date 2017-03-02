package com;

import static org.junit.Assert.*;

import org.junit.Test;

import com.controller.Controller;
import com.controller.CourseController;
import com.controller.NotFoundController;

public class RoutesTest extends Routes {

	@Test
	public void return404WhenNotFound() {
		Controller notFoundController = new Routes().findController("path");
		assertEquals(notFoundController.getClass(), NotFoundController.class);
	}
	
	@Test
	public void coursePathCase() throws Exception {		
		Controller courseController = new Routes().findController("/course");
		assertEquals(courseController.getClass(), CourseController.class);
	}
	
	@Test
	public void findAction() throws Exception {
		String actual = new Routes().findAction("/course/create");
		assertEquals("create", actual);
	}

}
