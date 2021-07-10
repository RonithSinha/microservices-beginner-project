package com.contact.entity;

import org.springframework.stereotype.Service;

@Service
public class Contact {
	private Long contactId;
	private String email;
	private String contactName;
	
	private Long userId;
	
	public Contact(Long contactId, String email, String contactName, Long userId) {
		super();
		this.contactId = contactId;
		this.email = email;
		this.contactName = contactName;
		this.userId = userId;
	}

	public Contact() {
	}

	public Long getContactId() {
		return contactId;
	}

	public void setContactId(Long contactId) {
		this.contactId = contactId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
	

}
