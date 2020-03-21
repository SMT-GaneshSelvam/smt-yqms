package com.yqms.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "area")
public class Area {

    @EmbeddedId
    @JsonProperty("id")
    private AreaIdentity areaIdentity;
    
	private String description;

	public AreaIdentity getAreaIdentity() {
		return areaIdentity;
	}

	public void setAreaIdentity(AreaIdentity areaIdentity) {
		this.areaIdentity = areaIdentity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
