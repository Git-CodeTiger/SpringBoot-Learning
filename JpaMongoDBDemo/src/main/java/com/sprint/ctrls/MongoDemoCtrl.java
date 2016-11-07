package com.sprint.ctrls;

import java.util.List;
import java.util.Collection;
import java.util.LinkedHashSet;
import com.sprint.models.domain.Person;
import com.sprint.models.domain.Location;
import com.sprint.models.dao.PersonRepository;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController
/*默认　test库 */
public class MongoDemoCtrl {

	@Autowired
	private PersonRepository personRepository;
	
	@RequestMapping("/save")
	public Person save() {
		Person p = new Person("x_zhaohu", 20);
		Collection<Location> locations = new LinkedHashSet<Location>();
		Location l1 = new Location("上海", "2009");
		Location l2 = new Location("合肥", "2010");
		Location l3 = new Location("山东", "2011");
		Location l4 = new Location("杭州", "2012");
		locations.add(l1);
		locations.add(l2);
		locations.add(l3);
		locations.add(l4);
		p.setLocations(locations);
		return personRepository.save(p);

	}
	
	@RequestMapping("/q1")
	public Person q1(String name) {
		return personRepository.findByName(name);
	}

	@RequestMapping("/q2")
	public List<Person> q2(Integer age) {
		return personRepository.withQueryFindByAge(age);
	}
}
