package com.view;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

public class ErrorView {

	public String creationForm(Exception exception) throws Exception {
		TemplateEngine templateEngine = new TemplateEngine();
		String stackTrace = convertToString(exception);
		Map<String, Object> data = new HashMap<>();
		data.put("stackTrace", stackTrace);
		return templateEngine.html("error.ftl", data);		
	}

	private String convertToString(Exception exception) {
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		exception.printStackTrace(pw);
		String stackTrace = sw.toString().replaceAll("\n", "<br>");
		return stackTrace;
	}

}
