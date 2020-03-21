package com.yqms.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonValue;

@Embeddable
public class SubAreaIdentity implements Serializable  {

	@JsonIgnore
	private Long locationId;
	
	@JsonIgnore
	private Long areaId;
	
	@JsonValue
	private Long subAreaId;

	public SubAreaIdentity() {
	}

	public SubAreaIdentity(Long locationId, Long areaId, Long subAreaId) {
		this.locationId = locationId;
		this.areaId = areaId;
		this.subAreaId = subAreaId;
	}

	public Long getLocationId() {
		return locationId;
	}

	public void setLocationId(Long locationId) {
		this.locationId = locationId;
	}

	public Long getAreaId() {
		return areaId;
	}

	public void setAreaId(Long areaId) {
		this.areaId = areaId;
	}

	public Long getSubAreaId() {
		return subAreaId;
	}

	public void setSubAreaId(Long subAreaId) {
		this.subAreaId = subAreaId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((areaId == null) ? 0 : areaId.hashCode());
		result = prime * result + ((locationId == null) ? 0 : locationId.hashCode());
		result = prime * result + ((subAreaId == null) ? 0 : subAreaId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SubAreaIdentity other = (SubAreaIdentity) obj;
		if (areaId == null) {
			if (other.areaId != null)
				return false;
		} else if (!areaId.equals(other.areaId))
			return false;
		if (locationId == null) {
			if (other.locationId != null)
				return false;
		} else if (!locationId.equals(other.locationId))
			return false;
		if (subAreaId == null) {
			if (other.subAreaId != null)
				return false;
		} else if (!subAreaId.equals(other.subAreaId))
			return false;
		return true;
	}	

}
