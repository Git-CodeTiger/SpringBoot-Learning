package com.sprint.ctrls;

import com.sprint.models.domain.SprintResponse;
import com.sprint.models.domain.SprintMessage;
import org.springframework.stereotype.Controller;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class WebSocketCtrl {
	@MessageMapping("/welcome")
	@SendTo("/topic/getResponse")
	public SprintResponse say(SprintMessage message) throws Exception {
		Thread.sleep(3000);
		return new SprintResponse("Welcome, " + message.getName() + "!");
	}

	@RequestMapping("/index")
	public String indexXXX() {
		return "index";
	}
}
