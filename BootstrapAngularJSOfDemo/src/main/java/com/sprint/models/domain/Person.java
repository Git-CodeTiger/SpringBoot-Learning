package com.sprint.models.domain;

public class Person {
	private String name;
	private Integer age;
	private String address;

	public Person() {
		super();
	}

	public Person(String name, Integer age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public void setName(String name) {
		this.name = name;
	} 

	public String getName() {
		return name;
	}

	public void setAge(Integer age) {
		this.age = age;
	} 

	public Integer getAge() {
		return age;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress() {
		return address;
	}
}	
