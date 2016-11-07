package com.sprint.ctrls;

import com.sprint.service.DemoService;
import com.sprint.models.domain.Person;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController
public class MyController {
	
	@Autowired
	private DemoService demoService;

	@RequestMapping("/rollback")
	public Person rollback(Person person) {
		return demoService.savePersonWithRollBack(person);
	}
	//Test localhost:8080/rollback?age=32&name=汪云飞
	//添加到数据库后，发生异常，退到无异常的开始，即：改了就改了，如果出粗就复原
	
	@RequestMapping("/norollback")
	public Person norollback(Person person) {
		return demoService.savePersonWithoutRollBack(person);
	}
	//Test localhost:8080/norollback?age=32&name=汪云飞
	//添加到数据库后，发生异常，不退到无异常的开始。即：改了就改了，出错也不复原了
	//不可取的
}
