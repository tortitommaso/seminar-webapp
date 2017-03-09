package com.view;

import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;

public class TemplateEngine {

	public String html(String templateName, Map<String, Object> data) throws Exception {
		Configuration cfg = new Configuration();
		cfg.setClassForTemplateLoading(this.getClass(), "/templates/");
		Template template = cfg.getTemplate(templateName);
		
		Writer out = new StringWriter();
		template.process(data, out);
		return out.toString();
	}

}
