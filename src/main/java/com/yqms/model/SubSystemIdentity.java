package com.yqms.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonValue;

@Embeddable
public class SubSystemIdentity implements Serializable  {
	
	@JsonIgnore
	private String unitRef;

	@JsonIgnore
	private String systemRef;
	
	@JsonValue
	private String subsystemRef;

	public SubSystemIdentity() {
	}

	public SubSystemIdentity(String unitRef, String systemRef, String subsystemRef) {
		super();
		this.unitRef = unitRef;
		this.systemRef = systemRef;
		this.subsystemRef = subsystemRef;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((subsystemRef == null) ? 0 : subsystemRef.hashCode());
		result = prime * result + ((systemRef == null) ? 0 : systemRef.hashCode());
		result = prime * result + ((unitRef == null) ? 0 : unitRef.hashCode());
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
		SubSystemIdentity other = (SubSystemIdentity) obj;
		if (subsystemRef == null) {
			if (other.subsystemRef != null)
				return false;
		} else if (!subsystemRef.equals(other.subsystemRef))
			return false;
		if (systemRef == null) {
			if (other.systemRef != null)
				return false;
		} else if (!systemRef.equals(other.systemRef))
			return false;
		if (unitRef == null) {
			if (other.unitRef != null)
				return false;
		} else if (!unitRef.equals(other.unitRef))
			return false;
		return true;
	}

}
