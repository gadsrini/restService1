package org.pkrm.restfullService.messanger.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.pkrm.restfullService.messanger.MessageService;
import org.pkrm.restfullService.messanger.model.Message;

@Path("/messages")
public class Resource {
	
	MessageService messageService = new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessages() {
		
		return messageService.getMessages();
	}
	
	@GET
	@Path("{messageId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Message getMessage(@PathParam(value = "messageId") long messageId) {
		System.out.println(messageId);
		return messageService.getMessage(messageId);
	}

}
