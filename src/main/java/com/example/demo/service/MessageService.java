package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.Message;

import java.util.*;

@Service
public class MessageService {
	private List<Message> messages = new ArrayList<>();
	private Long idCounter = 1L;

	public Message sendMessage(String recipient, String content) {

		String status;
		if (Math.random() > 0.4) {
			status = "SENT";
		} else {
			status = "FAILED";
		}

		Message message = new Message(idCounter++, recipient, content, status);
		messages.add(message);

		return message;
	}

	public List<Message> getAllMessages() {
		return messages;
	}

}
