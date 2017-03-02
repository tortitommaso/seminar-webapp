package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.RequestMethod;
import com.view.CourseView;

public class CourseController implements Controller {
	
	public void create(HttpServletRequest req, HttpServletResponse resp, RequestMethod requestMethod) throws Exception  {
		if(requestMethod.equals(RequestMethod.GET)) {
			resp.setStatus(HttpServletResponse.SC_OK);
			resp.getWriter().println(new CourseView().creationForm());
			//resp.getWriter().println("<html><body><p>200 form creazione</p></body></html>");					
		} 
		if(requestMethod.equals(RequestMethod.POST)) {
			req.toString();			
			resp.setStatus(HttpServletResponse.SC_OK);
			resp.getWriter().println("<html><body><p>action di post creazione</p></body></html>");								
		}
	}

}
