package com.validator;

import java.util.HashMap;
import java.util.Map;

public class CourseValidation {

	public Map<String, String> validate(String courseName, String totalSeats, String location) {
		Map<String, String> errors = new HashMap<>();
		new Validation(courseName, errors, "courseName").verifyNotEmpty().verifyMaxLength(15);
		new Validation(totalSeats, errors, "totalSeats").verifyNotEmpty().verifyIsANumber().verifyMaxLength(3).verifyLesserThan(100);
		new Validation(location, errors, "location").verifyNotEmpty().verifyMaxLength(20);
		return errors;
	}

}
