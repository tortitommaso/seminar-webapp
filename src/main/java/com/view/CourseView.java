package com.view;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.model.Course;

public class CourseView {
	
	public String creationForm(List<Course> courses, Map<String, String> errors) throws Exception {
		TemplateEngine templateEngine = new TemplateEngine();
		Map<String, Object> data = new HashMap<>();
		data.put("courses", courses);		
		data.put("errors", errors);
		return templateEngine.html("courses.ftl", data);
	}

	
}
