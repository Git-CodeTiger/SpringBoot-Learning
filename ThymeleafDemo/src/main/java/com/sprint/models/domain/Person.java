package com.sprint.models.domain;

public class Person {
	private String name;
	private Integer age;

	public Person() {
		super();
	}
	
	public Person(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	} 
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}
}


