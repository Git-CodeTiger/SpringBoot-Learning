package com.sprint.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sprint.models.domain.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
	
}
