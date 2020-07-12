package com.yqms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "unit")
public class Unit {

	@Id
	private String id;
	private String description;
	private Boolean imported;
	private Boolean verified;
	private String verifiedBy;
	private String verifiedResponsibleGroup;
	private String verifiedAt;
	private Boolean underMoC;
	private Boolean preventAPC;	
	@Column(name="unit_C1")
	private String unitC1;
	
}
