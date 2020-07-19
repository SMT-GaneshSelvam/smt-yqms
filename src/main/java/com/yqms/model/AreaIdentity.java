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
public class AreaIdentity implements Serializable  {

	@JsonIgnore
	private String locationRef;
	
	@JsonValue
	private String areaRef;

	public AreaIdentity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AreaIdentity(String locationRef, String areaRef) {
		super();
		this.locationRef = locationRef;
		this.areaRef = areaRef;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((areaRef == null) ? 0 : areaRef.hashCode());
		result = prime * result + ((locationRef == null) ? 0 : locationRef.hashCode());
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
		AreaIdentity other = (AreaIdentity) obj;
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
		return true;
	}

	

}
