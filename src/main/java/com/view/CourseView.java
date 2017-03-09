package com.view;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.model.Course;

public class CourseView {
	
	public String creationForm(List<Course> courses, Map<String, String> errors) throws Exception {
		TemplateEngine templateEngine = new TemplateEngine();
		List<String> coursesName = new ArrayList<>();
		for (Course course : courses) {
			coursesName.add(course.getName());
		}
		Collections.reverse(coursesName);
		Map<String, Object> data = new HashMap<>();
		data.put("courseNames", coursesName);
		data.put("errors", errors);
		return templateEngine.html("courses.ftl", data);
	}

	
}
