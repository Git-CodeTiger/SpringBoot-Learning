package com.sprint.ctrls;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloCtrl {
	
	@RequestMapping("/hello")
	public String hello() {
		
		return "request4";
	}

	@RequestMapping("/login")
	public String login() {
		return "requestLogin";
	}

	@RequestMapping("/request_data")
	public String requestData() {
		return "requestData";
	}

	@RequestMapping("/xxx")
	public String xxx() {
		return "xxx";
	}
}
