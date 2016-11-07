package com.sprint.di;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
@Service
public class UseFunctionService {
	@Autowired //将FunctionService的实体Bean注入到UseFunctionService中，让UseFunctionService具备FunctionService的功能。
	private FunctionService functionService;
	
	public String sayHello(String word) {
		return functionService.sayHello(word);
	}
}
