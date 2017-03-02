package com.view;

import static org.junit.Assert.*;

import org.junit.Test;

import com.view.CourseView;

public class CourseViewTest extends CourseView {

	@Test
	public void canRenderView() throws Exception {
		String actual = new CourseView().creationForm();
		assertNotNull(actual);
	}

}
