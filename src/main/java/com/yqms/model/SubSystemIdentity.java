package com.yqms.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonValue;

@Embeddable
public class SubSystemIdentity implements Serializable  {

	@JsonIgnore
	private String systemId;
	
	@JsonValue
	private String subSystemId;

	public SubSystemIdentity() {
	}

	public SubSystemIdentity(String systemId, String subSystemId) {
		this.systemId = systemId;
		this.subSystemId = subSystemId;
	}

	public String getSystemId() {
		return systemId;
	}

	public void setSystemId(String systemId) {
		this.systemId = systemId;
	}

	public String getSubSystemId() {
		return subSystemId;
	}

	public void setSubSystemId(String subSystemId) {
		this.subSystemId = subSystemId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((subSystemId == null) ? 0 : subSystemId.hashCode());
		result = prime * result + ((systemId == null) ? 0 : systemId.hashCode());
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
		if (subSystemId == null) {
			if (other.subSystemId != null)
				return false;
		} else if (!subSystemId.equals(other.subSystemId))
			return false;
		if (systemId == null) {
			if (other.systemId != null)
				return false;
		} else if (!systemId.equals(other.systemId))
			return false;
		return true;
	}
	
	

}
