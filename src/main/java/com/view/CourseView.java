package com.view;

import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
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
		Writer out = new StringWriter();
		template.process(data, out );
		return out.toString();
	}
	
}
