package com.sprint.jms;

import org.springframework.stereotype.Component;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
@Component
public class Receiver {
	
	@RabbitListener(queues = "my-queue")
	public void receiverMessage(String message) {
		System.out.println("Received <" + message + ">");
	}	
}
