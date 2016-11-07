package com.sprint;

import com.sprint.jms.Msg;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
@SpringBootApplication
public class Application implements CommandLineRunner {
	
	@Autowired
	private JmsTemplate jmsTemplate;
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception{
		jmsTemplate.send("my-destination", new Msg());
	}

}
