package com.model;

public class Course {
	private final String name;
	private final int totalSeats;
	private final String _location;
	
	public Course(String name, int totalSeats, String location) {
		this.name = name;
		this.totalSeats = totalSeats;
		_location = location;
	}
	public String getName() {
		return name;
	}
	
	public int getTotalSeats() {
		return totalSeats;
	}
	
	public String getLocation() {
		return _location;
	}
}
