package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.RequestMethod;
import com.model.Course;
import com.repository.CourseRepository;
import com.view.CourseView;

public class CourseController implements Controller {
	
	public void create(HttpServletRequest req, HttpServletResponse resp, RequestMethod requestMethod) throws Exception  {
		CourseRepository courseRepository = new CourseRepository();
		if(requestMethod.equals(RequestMethod.GET)) {
			showCourses(resp, courseRepository);
		} 
		if(requestMethod.equals(RequestMethod.POST)) {
			createCourse(req, resp, courseRepository);								
		}
	}

	private void createCourse(HttpServletRequest req, HttpServletResponse resp, CourseRepository courseRepository)
			throws IOException {
		String courseName = req.getParameter("courseName");
		int totalSeats = Integer.parseInt(req.getParameter("totalSeats"));
		Course course = new Course(courseName, totalSeats);
		
		courseRepository.add(course);
		resp.setStatus(HttpServletResponse.SC_OK);
		resp.sendRedirect("/course/create");
	}

	private void showCourses(HttpServletResponse resp, CourseRepository courseRepository)
			throws IOException, Exception {
		List<Course> courses = courseRepository.all();
		resp.setStatus(HttpServletResponse.SC_OK);
		resp.getWriter().println(new CourseView().creationForm(courses));
	}

}
