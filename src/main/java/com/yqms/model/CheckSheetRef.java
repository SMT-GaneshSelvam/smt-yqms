package com.yqms.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "checksheet_master")
@Getter
@Setter
public class CheckSheetRef {

	@Id
    @JsonProperty("id")
	private String checksheetName;
    @JsonProperty("description")
	private String checksheetDescription;

}
