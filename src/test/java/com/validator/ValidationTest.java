package com.validator;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class ValidationTest  {


	@Test
	public void verifyMaxLength() {
		Map<String, String> errors = new HashMap<>();
		new Validation("12", errors, "totalSeats").verifyMaxLength(1);
		assertEquals(errors.get("totalSeats-error"), "Length should be <= 1");
	}
	
	@Test
	public void verifyLesserThan() {
		Map<String, String> errors = new HashMap<>();
		new Validation("101", errors, "totalSeats").verifyLesserThan(100);
		assertEquals(errors.get("totalSeats-error"), "Value should be <= 100");
	}
	
	
	@Test
	public void verifyIsANumber() {
		Map<String, String> errors = new HashMap<>();
		new Validation("asdf", errors, "totalSeats").verifyIsANumber();
		assertEquals(errors.get("totalSeats-error"), "Should be a number");
	}
	
	@Test
	public void concatenation() {
		Map<String, String> errors = new HashMap<>();
		new Validation("", errors, "totalSeats").verifyNotEmpty().verifyIsANumber();
		assertEquals("Should not be empty - Should be a number", errors.get("totalSeats-error"));
	}
	
	@Test
	public void verifyNotEmpty() {
		Map<String, String> errors = new HashMap<>();
		new Validation("12", errors, "totalSeats").verifyNotEmpty();
		assertTrue(errors.isEmpty());
		new Validation("", errors, "totalSeats").verifyNotEmpty();
		assertEquals(errors.get("totalSeats-error"), "Should not be empty");
	}
	

}
