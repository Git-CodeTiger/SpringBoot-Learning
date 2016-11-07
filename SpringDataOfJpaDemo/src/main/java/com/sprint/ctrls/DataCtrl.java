package com.sprint.ctrls;

import java.util.List;
import com.sprint.models.dao.PersonRepository;
import com.sprint.models.domain.Person;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.PageRequest;
@RestController
public class DataCtrl {
	
	@Autowired
	PersonRepository personRepository;

	@RequestMapping("/save")
	public Person save(String name, String address, Integer age) {
		Person p = personRepository.save(new Person(null, name, age, address));
		return p;
	}
	
	@RequestMapping("/q1")
	public List<Person> q1(String address) {
		List<Person> people = personRepository.findByAddress(address);
		return people;
	} 
	
	@RequestMapping("/q2")
	public Person q2(String name, String address) {
		Person p = personRepository.findByNameAndAddress(name, address);
		return p;
	}

/*	@RequestMapping("/q3")
	public Person q3(String name, String address) {
		Person p = personRepository.withNameAndAddressQuery(name, address);
		return p;
	}

	@RequestMapping("/q4")
	public Person q4(String name, String address) {
		Person p = personRepository.withNameAndAddressNamedQuery(name, address);
		return p;
	}
*/
	@RequestMapping("/sort")
	public List<Person> sort() {
		List<Person> people = personRepository.findAll(new Sort(Direction.ASC, "age"));
		return people;
	}

	@RequestMapping("/page")
	public Page<Person> page() {
		Page<Person> pagePeople = personRepository.findAll(new PageRequest(1, 2));
		return pagePeople;
	}
}
