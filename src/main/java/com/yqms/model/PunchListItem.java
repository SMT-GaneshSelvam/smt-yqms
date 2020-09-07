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
@Table(name = "punchlist_item")
public class PunchListItem {
	
    @EmbeddedId
    @JsonProperty("punchNo")
    private PunchListItemIdentity punchListItemIdentity;
	private String description;

}
