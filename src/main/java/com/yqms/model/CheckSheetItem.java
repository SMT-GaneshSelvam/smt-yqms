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
@Table(name = "checksheet_item")
public class CheckSheetItem {
	
    @EmbeddedId
    @JsonProperty("lineNo")
    private CheckSheetItemIdentity checkSheetItemIdentity;
	private String description;
	private String group;
	private String testsSetup;
	private String header;
	private String setCount;
	private String set;
	private String units;
	private String minimum;
	private String maximum;
	private String required;

}
