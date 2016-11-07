package com.sprint.models.domain;

import java.util.Collection;
import java.util.LinkedHashSet;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
@Document
public class Person {
	
	@Id
	private String id;
	private String name;
	private Integer age;

	@Field("locs")
	private Collection<Location> locations = new LinkedHashSet<Location>();

	public Person(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void setLocations(Collection<Location> locations) {
		this.locations = locations;
	}

	public Collection<Location> getLocations() {
		return locations;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setInteger(Integer age) {
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}
} 
