package com.model;

public class Course {
	private final String name;
	private final int totalSeats;
	
	public Course(String name, int totalSeats) {
		this.name = name;
		this.totalSeats = totalSeats;
	}
	public String getName() {
		return name;
	}
	
	public int getTotalSeats() {
		return totalSeats;
	}
}
