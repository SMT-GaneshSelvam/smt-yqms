package com.yqms.model;

import javax.persistence.Column;
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
    @JsonProperty("description")
	private String subsystemDescription;

}
