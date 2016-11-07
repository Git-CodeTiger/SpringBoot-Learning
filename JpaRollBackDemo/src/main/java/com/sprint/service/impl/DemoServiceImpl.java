package com.sprint.service.impl;

import com.sprint.models.domain.Person;
import com.sprint.service.DemoService;
import com.sprint.models.dao.PersonRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
@Service
public class DemoServiceImpl implements DemoService {
	
	@Autowired
	private PersonRepository personRepository;
	
	@Transactional(rollbackFor={IllegalArgumentException.class})
	public Person savePersonWithRollBack(Person person) {
		Person p = personRepository.save(person);

		if (person.getName().equals("汪云飞")) {
			throw new IllegalArgumentException("汪云飞已存在，数据将回滚");
		}

		return p;
	}
	
	@Transactional(noRollbackFor={IllegalArgumentException.class})
	public Person savePersonWithoutRollBack(Person person) {
		Person p = personRepository.save(person);

		if (person.getName().equals("汪云飞")) {
			throw new IllegalArgumentException("汪云飞已存在，数据将不回滚");
		}

		return p;
	}
}
