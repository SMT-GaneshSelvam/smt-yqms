package com.yqms.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "location")
public class Location {

	@Id
	private String id;
	private String description;
	private Date addedAt;
	private String addedBy;
	private Boolean imported;
	private Boolean completed;
	private Boolean verified;
	private String verifiedBy;
	private String verifiedResponsibleGroup;
	private Date verifiedAt;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getAddedAt() {
		return addedAt;
	}
	public void setAddedAt(Date addedAt) {
		this.addedAt = addedAt;
	}
	public String getAddedBy() {
		return addedBy;
	}
	public void setAddedBy(String addedBy) {
		this.addedBy = addedBy;
	}
	public Boolean getImported() {
		return imported;
	}
	public void setImported(Boolean imported) {
		this.imported = imported;
	}
	public Boolean getCompleted() {
		return completed;
	}
	public void setCompleted(Boolean completed) {
		this.completed = completed;
	}
	public Boolean getVerified() {
		return verified;
	}
	public void setVerified(Boolean verified) {
		this.verified = verified;
	}
	public String getVerifiedBy() {
		return verifiedBy;
	}
	public void setVerifiedBy(String verifiedBy) {
		this.verifiedBy = verifiedBy;
	}
	public String getVerifiedResponsibleGroup() {
		return verifiedResponsibleGroup;
	}
	public void setVerifiedResponsibleGroup(String verifiedResponsibleGroup) {
		this.verifiedResponsibleGroup = verifiedResponsibleGroup;
	}
	public Date getVerifiedAt() {
		return verifiedAt;
	}
	public void setVerifiedAt(Date verifiedAt) {
		this.verifiedAt = verifiedAt;
	}
	
}
