package com.sprint.service;

import com.sprint.models.domain.Person;

public interface DemoService {
	public Person savePersonWithRollBack(Person person);
	public Person savePersonWithoutRollBack(Person person);
}
