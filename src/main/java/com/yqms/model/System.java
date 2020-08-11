package com.yqms.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "system_table")
public class System {

    @EmbeddedId
    @JsonProperty("id")
    private SystemIdentity systemIdentity;
    @JsonProperty("description")
	private String systemDescription;		

}
