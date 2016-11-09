package org.pkrm.restfullService.messanger.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Profile {

	private String profileId;
	private String name;
	private Date createdDate;

	public Profile() {

	}

	public Profile(String profileId, String name, Date createdDate) {
		super();
		this.profileId = profileId;
		this.name = name;
		this.createdDate = createdDate;
	}

	public String getProfileId() {
		return profileId;
	}

	public void setProfileId(String profileId) {
		this.profileId = profileId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

}
