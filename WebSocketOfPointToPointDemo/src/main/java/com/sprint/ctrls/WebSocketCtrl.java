package com.sprint.ctrls;

import java.security.Principal;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebSocketCtrl {
	
	@Autowired
	private SimpMessagingTemplate messagingTemplate;

	@MessageMapping("/chat")
	public void handleChat(Principal principal, String msg) {
		if (principal.getName().equals("username")) {
			messagingTemplate.convertAndSendToUser("name", "/queue/notifications", principal.getName() + "-send:" + msg);
		} else {
			messagingTemplate.convertAndSendToUser("username", "/queue/notifications", principal.getName() + "-send:" + msg);
		}
	}
}
