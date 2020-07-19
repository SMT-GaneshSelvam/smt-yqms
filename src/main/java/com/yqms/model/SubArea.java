package com.yqms.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "subarea")
public class SubArea {

    @EmbeddedId
    @JsonProperty("id")
    private SubAreaIdentity subAreaIdentity;
	private String subareaDescription;

}
