package com.yqms.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonValue;

@Embeddable
public class SubAreaIdentity implements Serializable  {

	@JsonIgnore
	private String locationId;
	
	@JsonIgnore
	private String areaId;
	
	@JsonValue
	private String subAreaId;

	public SubAreaIdentity() {
	}

	public SubAreaIdentity(String locationId, String areaId, String subAreaId) {
		this.locationId = locationId;
		this.areaId = areaId;
		this.subAreaId = subAreaId;
	}

	public String getLocationId() {
		return locationId;
	}

	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}

	public String getAreaId() {
		return areaId;
	}

	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}

	public String getSubAreaId() {
		return subAreaId;
	}

	public void setSubAreaId(String subAreaId) {
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
