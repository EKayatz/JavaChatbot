package com.ekayatz.chat.chat;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {
	@MessageMapping
	public ChatMessage sendMessage(
		@Payload ChatMessage chatMessage
	){

	}
}