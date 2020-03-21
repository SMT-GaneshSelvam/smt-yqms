package com.yqms.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "subarea")
public class SubArea {

    @EmbeddedId
    @JsonProperty("id")
    private SubAreaIdentity subAreaIdentity;
	private String description;

	public SubAreaIdentity getSubAreaIdentity() {
		return subAreaIdentity;
	}

	public void setSubAreaIdentity(SubAreaIdentity subAreaIdentity) {
		this.subAreaIdentity = subAreaIdentity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
