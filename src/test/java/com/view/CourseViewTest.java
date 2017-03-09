package com.view;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;

import com.model.Course;

public class CourseViewTest extends CourseView {

	@Test
	public void canRenderView() throws Exception {
		List<Course> courses = new ArrayList<>();
		courses.add(new Course("d&d", 1));
		String actual = new CourseView().creationForm(courses, new HashMap<String, String>());
		assertNotNull(actual);
		assertTrue(actual.contains("d&d"));
	}

}
