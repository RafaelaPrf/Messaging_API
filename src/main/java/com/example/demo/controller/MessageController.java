package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

import com.example.demo.model.Message;
import com.example.demo.service.MessageService;

import java.util.List;

@RestController
@RequestMapping("/messages")
public class MessageController {

	private final MessageService messageService;

	public MessageController(MessageService messageService) {
		this.messageService = messageService;
	}

	@PostMapping
	public Message sendMessage(@RequestBody Message request) {
		return messageService.sendMessage(request.getRecipient(), request.getContent());
	}

	@GetMapping
	public List<Message> getAllMessages() {
		return messageService.getAllMessages();
	}

}
