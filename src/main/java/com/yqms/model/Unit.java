package com.yqms.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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
	private String unitC1;	

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

	public Boolean getImported() {
		return imported;
	}

	public void setImported(Boolean imported) {
		this.imported = imported;
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

	public String getVerifiedAt() {
		return verifiedAt;
	}

	public void setVerifiedAt(String verifiedAt) {
		this.verifiedAt = verifiedAt;
	}

	public Boolean getUnderMoC() {
		return underMoC;
	}

	public void setUnderMoC(Boolean underMoC) {
		this.underMoC = underMoC;
	}

	public Boolean getPreventAPC() {
		return preventAPC;
	}

	public void setPreventAPC(Boolean preventAPC) {
		this.preventAPC = preventAPC;
	}

	public String getUnitC1() {
		return unitC1;
	}

	public void setUnitC1(String unitC1) {
		this.unitC1 = unitC1;
	}	

}
