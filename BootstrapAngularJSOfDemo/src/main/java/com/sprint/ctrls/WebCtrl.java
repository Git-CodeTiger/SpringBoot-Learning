package com.sprint.ctrls;

import com.sprint.models.domain.Person;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController
public class WebCtrl {
	
	@RequestMapping(value="/search", produces={MediaType.APPLICATION_JSON_VALUE})
	public Person search(String personName) {
		return new Person(personName, 32, "hefei");
	}
}
