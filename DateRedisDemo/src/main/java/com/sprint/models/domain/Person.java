package com.sprint.models.domain;

import java.io.Serializable;
public class Person implements Serializable{
	private static final long serialVersionUID = 1L;

	private String id;
	private String name;
	private Integer age;

	public Person() {
		super();
	}

	public Person(String id, String name, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.age =age;
	}

	public void setId(String id) {
		this.id = id;
	} 

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(Integer age) {
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
