package com.yqms.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "subsystem")
public class SubSystem {

    @EmbeddedId
    @JsonProperty("id")
    private SubSystemIdentity subSystemIdentity;
	private String description;		

	public SubSystemIdentity getSubSystemIdentity() {
		return subSystemIdentity;
	}

	public void setSubSystemIdentity(SubSystemIdentity subSystemIdentity) {
		this.subSystemIdentity = subSystemIdentity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}	

	public SubSystem() {
	}

	public SubSystem(SubSystemIdentity subSystemIdentity, String description) {
		this.subSystemIdentity = subSystemIdentity;
		this.description = description;
	}
	
	

}
