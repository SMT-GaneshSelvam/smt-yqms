package com.yqms.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonValue;

@Embeddable
public class SubTypeIdentity implements Serializable  {

	@JsonIgnore
	private String typeId;
	
	@JsonValue
	private String subTypeId;	

	public SubTypeIdentity() {
	}

	public SubTypeIdentity(String typeId, String subTypeId) {
		this.typeId = typeId;
		this.subTypeId = subTypeId;
	}

	public String getTypeId() {
		return typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public String getSubTypeId() {
		return subTypeId;
	}

	public void setSubTypeId(String subTypeId) {
		this.subTypeId = subTypeId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((subTypeId == null) ? 0 : subTypeId.hashCode());
		result = prime * result + ((typeId == null) ? 0 : typeId.hashCode());
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
		SubTypeIdentity other = (SubTypeIdentity) obj;
		if (subTypeId == null) {
			if (other.subTypeId != null)
				return false;
		} else if (!subTypeId.equals(other.subTypeId))
			return false;
		if (typeId == null) {
			if (other.typeId != null)
				return false;
		} else if (!typeId.equals(other.typeId))
			return false;
		return true;
	}	

}
