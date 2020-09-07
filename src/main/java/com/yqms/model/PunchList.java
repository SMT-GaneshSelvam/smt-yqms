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
@Table(name="punchlist")
public class PunchList {
	
	@Id
	private Long id;
	private String reference;
	private String appliesTo;
	private String tag;
	private String tag_desc;
	private String workpack;
	private String type;
	private String subtype;
	private String unit;
	private String system;
	private String subsystem;
	private String location;
	private String area;
	private String discipline;
	private String subarea;
	private String description;
	private String comments;
	private String drawing;
	private String raisedBy;
	private Date raisedDate;
	private String enteredBy;
	private Date enteredDate;
	private String category;
	private String responsiblePerson;
	private String responsibleGroup;
	private String defectType;
	private String estimatedManHours;
	private String estimatedCompletedDate;
	private String priority;
	private String cleared;
	private Date clearedDate;
	private String clearedBy;
	private String clearedByGroup;
	private String completed;
	private Date completedDate;
	private String completedBy;
	private String completedGroup;
	private String completedNotes;

}
