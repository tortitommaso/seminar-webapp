package com.repository;

import java.util.ArrayList;
import java.util.List;

import com.model.Course;

public class CourseRepository {
	private static List<Course> courses = new ArrayList<>();
	
	public List<Course> all() {
		return courses;
	}
	
	public void add(Course course) {
		courses.add(course);
	}
}
