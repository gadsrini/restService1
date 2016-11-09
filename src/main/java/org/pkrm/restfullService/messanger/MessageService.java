package org.pkrm.restfullService.messanger;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.pkrm.restfullService.messanger.database.DatabaseClass;
import org.pkrm.restfullService.messanger.model.Message;


public class MessageService {
	
	public MessageService() {		
		messages.put(1L, new Message("HelloGaddam", 1L, new Date(), "gaddam"));
		messages.put(2L, new Message("HelloSrinivas", 2L, new Date(), "Srinivas"));
	}
	
	private static Map<Long, Message> messages = DatabaseClass.getMessages();
	
	public List<Message> getMessages() {				
		return new ArrayList<Message>(messages.values());
	}

	public Message getMessage(long messageId) {
		return messages.get(messageId);
	}
	
	public Message addMessage(Message message) {		
		message.setMessageId(messages.size() + 1);
		messages.put(message.getMessageId(), message);
		return message;
	}
	
	public Message updateMessage(Message message) {		
		messages.put(message.getMessageId(), message);
		return message;
	}
	
	public Message removeMessage(long messageId) {		
		return messages.remove(messageId);
	}
}
