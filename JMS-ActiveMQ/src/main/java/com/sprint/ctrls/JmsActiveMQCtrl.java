package com.sprint.ctrls;

import com.sprint.jms.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.jms.core.JmsTemplate;
@RestController
public class JmsActiveMQCtrl {
	
	@Autowired
	private JmsTemplate jmsTemplate;

	@RequestMapping("/test-jms-activemq")
	public String testJmsActiveMQ() {
		jmsTemplate.send("my-destination", new Msg());
		return "ok? fine!";
	}
}
