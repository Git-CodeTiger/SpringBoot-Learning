package com.sprint;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.amqp.core.Queue;
import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
@SpringBootApplication
public class Application implements CommandLineRunner{

	@Autowired
	private RabbitTemplate rabbitTemplate;

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public Queue rabbitQueue() {
		return new Queue("my-queue");
	}

	@Override
	public void run(String... args) throws Exception {
		rabbitTemplate.convertAndSend("my-queue", "来自RabbitMQ的问候");
	}
}
