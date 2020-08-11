package com.yqms.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonValue;

import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class SystemIdentity implements Serializable  {

	@JsonIgnore
	private String unitRef;
	
	@JsonValue
	private String systemRef;

	public SystemIdentity() {
	}
	
	public SystemIdentity(String unitRef, String systemRef) {
		super();
		this.unitRef = unitRef;
		this.systemRef = systemRef;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		SystemIdentity other = (SystemIdentity) obj;
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
