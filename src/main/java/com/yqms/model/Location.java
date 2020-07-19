package com.yqms.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "location")
public class Location {

	@Id
	private String locationRef;
	private String locationDescription;
	private Date addedAt;
	private String addedBy;
	private Boolean imported;
	private Boolean completed;
	private Boolean verified;
	private String verifiedBy;
	private String verifiedResponsibleGroup;
	private Date verifiedAt;	

}
