package com.sprint.service;

import com.sprint.models.domain.Person;
public interface DemoService {
	public Person save(Person person);
	public void remove(Long id);
	public Person findOne(Person person);
}
