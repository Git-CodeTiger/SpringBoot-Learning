package com.sprint.models.domain;


public class Location {
	
	private String place;
	private String year;

	public Location(String place, String year) {
		super();
		this.place = place;
		this.year = year;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public void setYear(String year) {
		this.year = year;
	} 

	public String getPlace() {
		return place;
	}

	public String getYear() {
		return year;
	}
}
