package com.validator;

import java.util.Map;

public class Validation {

	private final String _fieldValue;
	private final Map<String, String> _errors;
	private final String _prefix;

	public Validation(String fieldValue, Map<String, String> errors, String fieldName) {
		_fieldValue = fieldValue;
		_errors = errors;
		_prefix = fieldName + "-error";
	}

	public Validation verifyNotEmpty() {
		if (_fieldValue == null || _fieldValue.isEmpty()) {
			errorsAppend("Should not be empty");			
		}
		return this;
	}


	public Validation verifyIsANumber() {
		try {
			Integer.parseInt(_fieldValue);
		} catch (NumberFormatException e) {
			errorsAppend("Should be a number");
		}		
		return this;
	}

	public Validation verifyMaxLength(int maxLength) {
		if (_fieldValue.length() > maxLength) {
			errorsAppend("Length should be <= " + maxLength);
		}
		return this;
	}

	public Validation verifyLesserThan(int maxValue) {
		boolean noPreviousErrorsOnSameField = _errors.get(_prefix) == null ;
		if (noPreviousErrorsOnSameField && Integer.parseInt(_fieldValue) > maxValue) {
			errorsAppend("Value should be <= " + maxValue);
		}
		return this;
	}

	
	private void errorsAppend(String message) {
		if (_errors.get(_prefix) != null) {
			String previousMessage = _errors.get(_prefix);
			_errors.put(_prefix, previousMessage + " - " + message);
		} else {
			_errors.put(_prefix, message);			
		}
	}

	
}
