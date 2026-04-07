package com.example.demo.model;

public class Message {
	private Long id;
	private String recipient;
	private String content;
	private String status;

	public Message(Long id, String recipient, String content, String status) {
		this.setId(id);
		this.setRecipient(recipient);
		this.setContent(content);
		this.setStatus(status);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRecipient() {
		return recipient;
	}

	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
