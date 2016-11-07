package com.sprint.ctrls;

import com.sprint.models.domain.Person;
import com.sprint.service.DemoService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController
public class CacheController {
	
	@Autowired
	private DemoService demoService;

	@RequestMapping("/put")
	public Person save(Person person) {
		return demoService.save(person);
	}

	@RequestMapping("/delete")
	public String remove(Long id) {
		demoService.remove(id);
		return "ok";
	}

	@RequestMapping("/find")
	public Person findOne(Person person) {
		return demoService.findOne(person);
	}

	@RequestMapping("/xxx")
	public String xxxMethod() {
		return "我好困";
	}
}
