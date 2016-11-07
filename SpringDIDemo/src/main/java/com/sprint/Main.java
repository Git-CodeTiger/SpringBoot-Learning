package com.sprint;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.sprint.config.DiConfig;
import com.sprint.di.UseFunctionService;
import com.sprint.di.FunctionService;
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(DiConfig.class);			UseFunctionService useFunctionService = ctx.getBean(UseFunctionService.class);
		System.out.println(useFunctionService.sayHello("di"));
		ctx.close();
	}
}
