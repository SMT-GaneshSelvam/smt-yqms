package com.yqms.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonValue;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Embeddable
public class SubAreaIdentity implements Serializable  {

	@JsonIgnore
	private String locationRef;
	
	@JsonIgnore
	private String areaRef;
	
	@JsonValue
	private String subareaRef;

	public SubAreaIdentity() {
	}

	public SubAreaIdentity(String locationRef, String areaRef, String subareaRef) {
		super();
		this.locationRef = locationRef;
		this.areaRef = areaRef;
		this.subareaRef = subareaRef;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((areaRef == null) ? 0 : areaRef.hashCode());
		result = prime * result + ((locationRef == null) ? 0 : locationRef.hashCode());
		result = prime * result + ((subareaRef == null) ? 0 : subareaRef.hashCode());
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
		if (areaRef == null) {
			if (other.areaRef != null)
				return false;
		} else if (!areaRef.equals(other.areaRef))
			return false;
		if (locationRef == null) {
			if (other.locationRef != null)
				return false;
		} else if (!locationRef.equals(other.locationRef))
			return false;
		if (subareaRef == null) {
			if (other.subareaRef != null)
				return false;
		} else if (!subareaRef.equals(other.subareaRef))
			return false;
		return true;
	}	
	
}
