package com.sprint.ctrls;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.core.Queue;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class RabbitMQCtrl {
	
	@Autowired
	private RabbitTemplate rabbitTemplate;

//	@Bean
//	public Queue rabbitQueue() {
//		return new Queue("my-queue");
//	}
	@RequestMapping("/test-jms-rabbitmq")
	public String testJmsRabbitMQ() {
		rabbitTemplate.convertAndSend("my-queue", "来自RabbitMQ的问候");
		return "ok? fine!";
	}
}
