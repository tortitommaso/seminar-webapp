package com.validator;

import java.util.HashMap;
import java.util.Map;

public class CourseValidation {

	public Map<String, String> validate(String courseName, String totalSeats) {
		Map<String, String> errors = new HashMap<>();
		if (courseName.isEmpty()) {
			errors.put("courseName-error", "invalid - please provide a not empty string");			
		}
		if (totalSeats.isEmpty()) {			
			errors.put("totalSeats-error", "invalid - please provide a not empty number");			
		}
		try {
			int totalSeatsAsInt = Integer.parseInt(totalSeats);
			if (totalSeatsAsInt > 200) {				
				errors.put("totalSeats-error", "invalid - no more than 200 seats are available!");
			}
				
		} catch (NumberFormatException e) {
			errors.put("totalSeats-error", "invalid - please insert a valid number");
		}

		return errors;
	}

}
