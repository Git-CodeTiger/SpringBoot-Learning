package com.sprint.serice.DemoServiceImpl;

import com.sprint.service.DemoService;
import com.sprint.models.dao.PersonRepository;
import com.sprint.models.domain.Person;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;

@Service
public class DemoServiceImpl implements DemoService{
	
	@Autowired
	private PersonRepository personRepository;

	@Override
	@CachePut(value = "people", key = "#person.id")
	public Person save(Person person) {
		Person p = personRepository.save(person);
		System.out.println("为id,key 为:" + p.getId() + "数据做了缓存！");
		return p;
	}

	@Override
	@CacheEvict(value = "people")
	public void remove(Long id) {
		System.out.println("删除了id, key 为" + id + "的数据缓存");
		personRepository.delete(id);
	}

	@Override
	@Cacheable(value="people", key="#person.id")
	public Person findOne(Person person) {
		Person p = personRepository.findOne(person.getId());
		System.out.println("为id,key为" + p.getId() + "数据做了缓存");
		return p;
	}	
}
