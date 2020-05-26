package com.yqms.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="punchlist")
public class PunchList {
	
	@Id
	private Long punchlist_no;
	private String reference;
	private String applies_to;
	private String tag_no;
	private String tag_desc;
	private String workpack;
	private String type_ref;
	private String subtype_ref;
	private String unit_ref;
	private String system_ref;
	private String subsystem_ref;
	private String location_ref;
	private String area_ref;
	private String punchlist_discipline;
	private String tag_discipline_ref;
	private String subarea_ref;
	private String punchlist_description;
	private String main_punchlist_comment;
	private String drawing;
	private String raised_by;
	private Date raised_at;
	private String entered_by;
	private Date entered_at;
	private String category;
	private String responsible_person;
	private String responsible_group;
	private String defect_type;
	private String est_man_data;
	private String est_completed_date;
	private String priority;
	private String cleared;
	private Date cleared_at;
	private String cleared_by;
	private String cleared_group;
	private String completed;
	private Date completed_at;
	private String completed_by;
	private String completed_group;
	private String completed_pl_notes;
	private String po_number;
	private String subsystem_group;
	
	public Long getPunchlist_no() {
		return punchlist_no;
	}
	public void setPunchlist_no(Long punchlist_no) {
		this.punchlist_no = punchlist_no;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getApplies_to() {
		return applies_to;
	}
	public void setApplies_to(String applies_to) {
		this.applies_to = applies_to;
	}
	public String getTag_no() {
		return tag_no;
	}
	public void setTag_no(String tag_no) {
		this.tag_no = tag_no;
	}
	public String getTag_desc() {
		return tag_desc;
	}
	public void setTag_desc(String tag_desc) {
		this.tag_desc = tag_desc;
	}
	public String getWorkpack() {
		return workpack;
	}
	public void setWorkpack(String workpack) {
		this.workpack = workpack;
	}
	public String getType_ref() {
		return type_ref;
	}
	public void setType_ref(String type_ref) {
		this.type_ref = type_ref;
	}
	public String getSubtype_ref() {
		return subtype_ref;
	}
	public void setSubtype_ref(String subtype_ref) {
		this.subtype_ref = subtype_ref;
	}
	public String getUnit_ref() {
		return unit_ref;
	}
	public void setUnit_ref(String unit_ref) {
		this.unit_ref = unit_ref;
	}
	public String getSystem_ref() {
		return system_ref;
	}
	public void setSystem_ref(String system_ref) {
		this.system_ref = system_ref;
	}
	public String getSubsystem_ref() {
		return subsystem_ref;
	}
	public void setSubsystem_ref(String subsystem_ref) {
		this.subsystem_ref = subsystem_ref;
	}
	public String getLocation_ref() {
		return location_ref;
	}
	public void setLocation_ref(String location_ref) {
		this.location_ref = location_ref;
	}
	public String getArea_ref() {
		return area_ref;
	}
	public void setArea_ref(String area_ref) {
		this.area_ref = area_ref;
	}
	public String getPunchlist_discipline() {
		return punchlist_discipline;
	}
	public void setPunchlist_discipline(String punchlist_discipline) {
		this.punchlist_discipline = punchlist_discipline;
	}
	public String getTag_discipline_ref() {
		return tag_discipline_ref;
	}
	public void setTag_discipline_ref(String tag_discipline_ref) {
		this.tag_discipline_ref = tag_discipline_ref;
	}
	public String getSubarea_ref() {
		return subarea_ref;
	}
	public void setSubarea_ref(String subarea_ref) {
		this.subarea_ref = subarea_ref;
	}
	public String getPunchlist_description() {
		return punchlist_description;
	}
	public void setPunchlist_description(String punchlist_description) {
		this.punchlist_description = punchlist_description;
	}
	public String getMain_punchlist_comment() {
		return main_punchlist_comment;
	}
	public void setMain_punchlist_comment(String main_punchlist_comment) {
		this.main_punchlist_comment = main_punchlist_comment;
	}
	public String getDrawing() {
		return drawing;
	}
	public void setDrawing(String drawing) {
		this.drawing = drawing;
	}
	public String getRaised_by() {
		return raised_by;
	}
	public void setRaised_by(String raised_by) {
		this.raised_by = raised_by;
	}
	public Date getRaised_at() {
		return raised_at;
	}
	public void setRaised_at(Date raised_at) {
		this.raised_at = raised_at;
	}
	public String getEntered_by() {
		return entered_by;
	}
	public void setEntered_by(String entered_by) {
		this.entered_by = entered_by;
	}
	public Date getEntered_at() {
		return entered_at;
	}
	public void setEntered_at(Date entered_at) {
		this.entered_at = entered_at;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getResponsible_person() {
		return responsible_person;
	}
	public void setResponsible_person(String responsible_person) {
		this.responsible_person = responsible_person;
	}
	public String getResponsible_group() {
		return responsible_group;
	}
	public void setResponsible_group(String responsible_group) {
		this.responsible_group = responsible_group;
	}
	public String getDefect_type() {
		return defect_type;
	}
	public void setDefect_type(String defect_type) {
		this.defect_type = defect_type;
	}
	public String getEst_man_data() {
		return est_man_data;
	}
	public void setEst_man_data(String est_man_data) {
		this.est_man_data = est_man_data;
	}
	public String getEst_completed_date() {
		return est_completed_date;
	}
	public void setEst_completed_date(String est_completed_date) {
		this.est_completed_date = est_completed_date;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getCleared() {
		return cleared;
	}
	public void setCleared(String cleared) {
		this.cleared = cleared;
	}
	public Date getCleared_at() {
		return cleared_at;
	}
	public void setCleared_at(Date cleared_at) {
		this.cleared_at = cleared_at;
	}
	public String getCleared_by() {
		return cleared_by;
	}
	public void setCleared_by(String cleared_by) {
		this.cleared_by = cleared_by;
	}
	public String getCleared_group() {
		return cleared_group;
	}
	public void setCleared_group(String cleared_group) {
		this.cleared_group = cleared_group;
	}
	public String getCompleted() {
		return completed;
	}
	public void setCompleted(String completed) {
		this.completed = completed;
	}
	public Date getCompleted_at() {
		return completed_at;
	}
	public void setCompleted_at(Date completed_at) {
		this.completed_at = completed_at;
	}
	public String getCompleted_by() {
		return completed_by;
	}
	public void setCompleted_by(String completed_by) {
		this.completed_by = completed_by;
	}
	public String getCompleted_group() {
		return completed_group;
	}
	public void setCompleted_group(String completed_group) {
		this.completed_group = completed_group;
	}
	public String getCompleted_pl_notes() {
		return completed_pl_notes;
	}
	public void setCompleted_pl_notes(String completed_pl_notes) {
		this.completed_pl_notes = completed_pl_notes;
	}
	public String getPo_number() {
		return po_number;
	}
	public void setPo_number(String po_number) {
		this.po_number = po_number;
	}
	public String getSubsystem_group() {
		return subsystem_group;
	}
	public void setSubsystem_group(String subsystem_group) {
		this.subsystem_group = subsystem_group;
	}	

}
