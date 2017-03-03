package com.view;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.model.Course;

public class CourseView {
	
	public String creationForm(List<Course> courses) throws Exception {
		TemplateEngine templateEngine = new TemplateEngine();
		List<String> coursesName = new ArrayList<>();
		for (Course course : courses) {
			coursesName.add(course.getName());
		}
		Collections.reverse(coursesName);
		return templateEngine.html("courses.ftl", coursesName);
	}

	
}
