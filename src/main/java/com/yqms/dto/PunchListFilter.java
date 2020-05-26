package com.yqms.dto;

import java.util.List;

public class PunchListFilter {
	
	private Long punchListNumber;
	private List<String> unit;
	private List<String> system;
	private List<String> subSystem;
	private List<String> location;
	private List<String> area;
	private List<String> subArea;	
	private List<String> category;
	private List<String> defectType;
	private List<String> priority;	
	private List<String> discipline;
	private List<String> responsibleGroup;
	private List<String> workpack;	
	
	public Long getPunchListNumber() {
		return punchListNumber;
	}
	public void setPunchListNumber(Long punchListNumber) {
		this.punchListNumber = punchListNumber;
	}
	public List<String> getUnit() {
		return unit;
	}
	public void setUnit(List<String> unit) {
		this.unit = unit;
	}
	public List<String> getSystem() {
		return system;
	}
	public void setSystem(List<String> system) {
		this.system = system;
	}
	public List<String> getSubSystem() {
		return subSystem;
	}
	public void setSubSystem(List<String> subSystem) {
		this.subSystem = subSystem;
	}
	public List<String> getLocation() {
		return location;
	}
	public void setLocation(List<String> location) {
		this.location = location;
	}
	public List<String> getArea() {
		return area;
	}
	public void setArea(List<String> area) {
		this.area = area;
	}
	public List<String> getSubArea() {
		return subArea;
	}
	public void setSubArea(List<String> subArea) {
		this.subArea = subArea;
	}
	public List<String> getCategory() {
		return category;
	}
	public void setCategory(List<String> category) {
		this.category = category;
	}
	public List<String> getDefectType() {
		return defectType;
	}
	public void setDefectType(List<String> defectType) {
		this.defectType = defectType;
	}
	public List<String> getPriority() {
		return priority;
	}
	public void setPriority(List<String> priority) {
		this.priority = priority;
	}
	public List<String> getDiscipline() {
		return discipline;
	}
	public void setDiscipline(List<String> discipline) {
		this.discipline = discipline;
	}
	public List<String> getResponsibleGroup() {
		return responsibleGroup;
	}
	public void setResponsibleGroup(List<String> responsibleGroup) {
		this.responsibleGroup = responsibleGroup;
	}
	public List<String> getWorkpack() {
		return workpack;
	}
	public void setWorkpack(List<String> workpack) {
		this.workpack = workpack;
	}	
}
