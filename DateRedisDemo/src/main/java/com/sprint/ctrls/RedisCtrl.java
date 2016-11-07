package com.sprint.ctrls;

import com.sprint.models.domain.Person;
import com.sprint.models.dao.PersonDao;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController
public class RedisCtrl {
	
	@Autowired
	private PersonDao personDao;

	@RequestMapping("/set")
	public void set() {
		Person person = new Person("1", "x_zhaohu", 21);
		personDao.save(person);
		personDao.stringRedisTemplateDemo();	
	}

	@RequestMapping("/getStr")
	public String getStr() {
		return personDao.getString();
	}

	@RequestMapping("/getPerson")
	public Person getPerson() {
		return personDao.getPerson();
	}
}
