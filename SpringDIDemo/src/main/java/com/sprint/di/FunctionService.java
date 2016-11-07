package com.sprint.di;

import org.springframework.stereotype.Service;
@Service
public class FunctionService {
	public String sayHello(String word) {
		return "hello" + word + "!";
	}
}
