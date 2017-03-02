package com.controller;

import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;

public class CourseView {
	
	public String creationForm() throws Exception {
		Configuration cfg = new Configuration();
		cfg.setClassForTemplateLoading(this.getClass(), "/templates/");
		Template template = cfg.getTemplate("courses.ftl");
		Map<String, Object> data = new HashMap<>();
		data.put("message", "Hello World!");
		List<String> countries = new ArrayList<>();
		countries.add("India");
		countries.add("United States");
		countries.add("Germany");
		countries.add("France");
		data.put("countries", countries);
		Writer out = new StringWriter();
		template.process(data, out );
		return out.toString();
	}
	
}
