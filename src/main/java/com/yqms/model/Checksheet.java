package com.yqms.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="checksheet")
public class Checksheet {
	
	@Id
	private Long fcr_id;
	private String fcr_ref;
	private String tag_no;
	private String tag_desc;
	private String doc_type;
	private String type;
	private String sub_type;
	private String checksheet;
	private String check_type;
	private String unit_ref;
	private String system_ref;
	private String subsystem_ref;
	private String workpack_no;
	private String location_ref;
	private String area_ref;
	private String subarea_ref;
	private String tag_discipline;
	private String checksheet_disc_ref;
	private String tag_group;
	private String building_number;
	private String building_no_2;
	private Boolean executed;
	private String executed_by;
	private String executed_group;
	private Date executed_at;
	private Boolean completed;
	private String completed_by;
	private String completed_group;
	private Date completed_at;
	private Boolean approved;
	private String approved_by;
	private Date approved_at;
	private Long sheet_revision;
	private String parent_tag;
	private String loop_tag;
	private String module;
	private Boolean has_competency;
	private Boolean checksheet_has_master;
	private Boolean soft_tag;
	private Boolean cable_tag;
	private Boolean is_loop;
	private Boolean printed;
	private Date printed_at;
	private Long a_punchlist_outstanding;
	private String turnover_group;
	private String contractor;
	private String scanned_at;
	private Long man_hours;
	private String scanned_by;
	private String prim_drawing;
	private Boolean electronic;
	private String duration_days;
	private Boolean requires_2_step_completion;
	private String group_col;
	private Boolean issued;
	private Date issued_at;
	private String issued_id;
	private String issued_group;
	private String checksheet_description;
	
	public Long getFcr_id() {
		return fcr_id;
	}
	public void setFcr_id(Long fcr_id) {
		this.fcr_id = fcr_id;
	}
	public String getFcr_ref() {
		return fcr_ref;
	}
	public void setFcr_ref(String fcr_ref) {
		this.fcr_ref = fcr_ref;
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
	public String getDoc_type() {
		return doc_type;
	}
	public void setDoc_type(String doc_type) {
		this.doc_type = doc_type;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSub_type() {
		return sub_type;
	}
	public void setSub_type(String sub_type) {
		this.sub_type = sub_type;
	}
	public String getChecksheet() {
		return checksheet;
	}
	public void setChecksheet(String checksheet) {
		this.checksheet = checksheet;
	}
	public String getCheck_type() {
		return check_type;
	}
	public void setCheck_type(String check_type) {
		this.check_type = check_type;
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
	public String getWorkpack_no() {
		return workpack_no;
	}
	public void setWorkpack_no(String workpack_no) {
		this.workpack_no = workpack_no;
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
	public String getSubarea_ref() {
		return subarea_ref;
	}
	public void setSubarea_ref(String subarea_ref) {
		this.subarea_ref = subarea_ref;
	}
	public String getTag_discipline() {
		return tag_discipline;
	}
	public void setTag_discipline(String tag_discipline) {
		this.tag_discipline = tag_discipline;
	}
	public String getChecksheet_disc_ref() {
		return checksheet_disc_ref;
	}
	public void setChecksheet_disc_ref(String checksheet_disc_ref) {
		this.checksheet_disc_ref = checksheet_disc_ref;
	}
	public String getTag_group() {
		return tag_group;
	}
	public void setTag_group(String tag_group) {
		this.tag_group = tag_group;
	}
	public String getBuilding_number() {
		return building_number;
	}
	public void setBuilding_number(String building_number) {
		this.building_number = building_number;
	}
	public String getBuilding_no_2() {
		return building_no_2;
	}
	public void setBuilding_no_2(String building_no_2) {
		this.building_no_2 = building_no_2;
	}
	public Boolean getExecuted() {
		return executed;
	}
	public void setExecuted(Boolean executed) {
		this.executed = executed;
	}
	public String getExecuted_by() {
		return executed_by;
	}
	public void setExecuted_by(String executed_by) {
		this.executed_by = executed_by;
	}
	public String getExecuted_group() {
		return executed_group;
	}
	public void setExecuted_group(String executed_group) {
		this.executed_group = executed_group;
	}
	public Date getExecuted_at() {
		return executed_at;
	}
	public void setExecuted_at(Date executed_at) {
		this.executed_at = executed_at;
	}
	public Boolean getCompleted() {
		return completed;
	}
	public void setCompleted(Boolean completed) {
		this.completed = completed;
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
	public Date getCompleted_at() {
		return completed_at;
	}
	public void setCompleted_at(Date completed_at) {
		this.completed_at = completed_at;
	}
	public Boolean getApproved() {
		return approved;
	}
	public void setApproved(Boolean approved) {
		this.approved = approved;
	}
	public String getApproved_by() {
		return approved_by;
	}
	public void setApproved_by(String approved_by) {
		this.approved_by = approved_by;
	}
	public Date getApproved_at() {
		return approved_at;
	}
	public void setApproved_at(Date approved_at) {
		this.approved_at = approved_at;
	}
	public Long getSheet_revision() {
		return sheet_revision;
	}
	public void setSheet_revision(Long sheet_revision) {
		this.sheet_revision = sheet_revision;
	}
	public String getParent_tag() {
		return parent_tag;
	}
	public void setParent_tag(String parent_tag) {
		this.parent_tag = parent_tag;
	}
	public String getLoop_tag() {
		return loop_tag;
	}
	public void setLoop_tag(String loop_tag) {
		this.loop_tag = loop_tag;
	}
	public String getModule() {
		return module;
	}
	public void setModule(String module) {
		this.module = module;
	}
	public Boolean getHas_competency() {
		return has_competency;
	}
	public void setHas_competency(Boolean has_competency) {
		this.has_competency = has_competency;
	}
	public Boolean getChecksheet_has_master() {
		return checksheet_has_master;
	}
	public void setChecksheet_has_master(Boolean checksheet_has_master) {
		this.checksheet_has_master = checksheet_has_master;
	}
	public Boolean getSoft_tag() {
		return soft_tag;
	}
	public void setSoft_tag(Boolean soft_tag) {
		this.soft_tag = soft_tag;
	}
	public Boolean getCable_tag() {
		return cable_tag;
	}
	public void setCable_tag(Boolean cable_tag) {
		this.cable_tag = cable_tag;
	}
	public Boolean getIs_loop() {
		return is_loop;
	}
	public void setIs_loop(Boolean is_loop) {
		this.is_loop = is_loop;
	}
	public Boolean getPrinted() {
		return printed;
	}
	public void setPrinted(Boolean printed) {
		this.printed = printed;
	}
	public Date getPrinted_at() {
		return printed_at;
	}
	public void setPrinted_at(Date printed_at) {
		this.printed_at = printed_at;
	}
	public Long getA_punchlist_outstanding() {
		return a_punchlist_outstanding;
	}
	public void setA_punchlist_outstanding(Long a_punchlist_outstanding) {
		this.a_punchlist_outstanding = a_punchlist_outstanding;
	}
	public String getTurnover_group() {
		return turnover_group;
	}
	public void setTurnover_group(String turnover_group) {
		this.turnover_group = turnover_group;
	}
	public String getContractor() {
		return contractor;
	}
	public void setContractor(String contractor) {
		this.contractor = contractor;
	}
	public String getScanned_at() {
		return scanned_at;
	}
	public void setScanned_at(String scanned_at) {
		this.scanned_at = scanned_at;
	}
	public Long getMan_hours() {
		return man_hours;
	}
	public void setMan_hours(Long man_hours) {
		this.man_hours = man_hours;
	}
	public String getScanned_by() {
		return scanned_by;
	}
	public void setScanned_by(String scanned_by) {
		this.scanned_by = scanned_by;
	}
	public String getPrim_drawing() {
		return prim_drawing;
	}
	public void setPrim_drawing(String prim_drawing) {
		this.prim_drawing = prim_drawing;
	}
	public Boolean getElectronic() {
		return electronic;
	}
	public void setElectronic(Boolean electronic) {
		this.electronic = electronic;
	}
	public String getDuration_days() {
		return duration_days;
	}
	public void setDuration_days(String duration_days) {
		this.duration_days = duration_days;
	}
	public Boolean getRequires_2_step_completion() {
		return requires_2_step_completion;
	}
	public void setRequires_2_step_completion(Boolean requires_2_step_completion) {
		this.requires_2_step_completion = requires_2_step_completion;
	}
	public String getGroup() {
		return group_col;
	}
	public void setGroup(String group_col) {
		this.group_col = group_col;
	}
	public Boolean getIssued() {
		return issued;
	}
	public void setIssued(Boolean issued) {
		this.issued = issued;
	}
	public Date getIssued_at() {
		return issued_at;
	}
	public void setIssued_at(Date issued_at) {
		this.issued_at = issued_at;
	}
	public String getIssued_id() {
		return issued_id;
	}
	public void setIssued_id(String issued_id) {
		this.issued_id = issued_id;
	}
	public String getIssued_group() {
		return issued_group;
	}
	public void setIssued_group(String issued_group) {
		this.issued_group = issued_group;
	}
	public String getChecksheet_description() {
		return checksheet_description;
	}
	public void setChecksheet_description(String checksheet_description) {
		this.checksheet_description = checksheet_description;
	}

}
