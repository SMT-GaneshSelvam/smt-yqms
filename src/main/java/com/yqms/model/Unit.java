package com.yqms.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "unit")
public class Unit {

	@Id
    @JsonProperty("id")
	private String unitRef;
    @JsonProperty("description")
	private String unitDescription;
	private String unitC1;
	private Boolean imported;
	private Boolean verified;
	private String verifiedBy;
	private String verifiedResponsibleGroup;
	private String verifiedAt;
	private Boolean underMoC;
	private Boolean preventAPC;	
	
}
