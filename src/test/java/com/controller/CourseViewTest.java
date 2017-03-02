package com.controller;

import static org.junit.Assert.*;

import org.junit.Test;

public class CourseViewTest extends CourseView {

	@Test
	public void canRenderView() throws Exception {
		String actual = new CourseView().creationForm();
		assertNotNull(actual);
	}

}
