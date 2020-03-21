package com.yqms.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "subtype")
public class SubType {

    @EmbeddedId
    @JsonProperty("id")
    private SubTypeIdentity subTypeIdentity;
    
	private String description;	

	public SubTypeIdentity getSubTypeIdentity() {
		return subTypeIdentity;
	}

	public void setSubTypeIdentity(SubTypeIdentity subTypeIdentity) {
		this.subTypeIdentity = subTypeIdentity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
