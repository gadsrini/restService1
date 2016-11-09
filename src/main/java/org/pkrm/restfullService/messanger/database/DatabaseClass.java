package org.pkrm.restfullService.messanger.database;

import java.util.HashMap;
import java.util.Map;

import org.pkrm.restfullService.messanger.model.Message;
import org.pkrm.restfullService.messanger.model.Profile;

public class DatabaseClass {

	private static Map<Long, Message> messages = new HashMap();
	private static Map<Long, Profile> profiles = new HashMap();

	public static Map<Long, Message> getMessages() {
		return messages;

	}

	public static Map<Long, Profile> getProfiles() {
		return profiles;

	}

}
