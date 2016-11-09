package org.pkrm.restfullService.messanger.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message {

	private String message;
	private long messageId;
	private Date createdDate;
	private String authour;
	
	public Message() {
		
	}

	public Message(String message, long messageId, Date createdDate,
			String authour) {
		super();
		this.message = message;
		this.messageId = messageId;
		this.createdDate = createdDate;
		this.authour = authour;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public long getMessageId() {
		return messageId;
	}

	public void setMessageId(long messageId) {
		this.messageId = messageId;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getAuthour() {
		return authour;
	}

	public void setAuthour(String authour) {
		this.authour = authour;
	}

}
