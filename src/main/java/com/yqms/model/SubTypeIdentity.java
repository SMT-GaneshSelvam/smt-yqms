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
public class SubTypeIdentity implements Serializable  {

	@JsonIgnore
	private String typeRef;
	
	@JsonValue
	private String subtypeRef;	

	public SubTypeIdentity() {
	}

	public SubTypeIdentity(String typeRef, String subtypeRef) {
		super();
		this.typeRef = typeRef;
		this.subtypeRef = subtypeRef;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((subtypeRef == null) ? 0 : subtypeRef.hashCode());
		result = prime * result + ((typeRef == null) ? 0 : typeRef.hashCode());
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
		if (subtypeRef == null) {
			if (other.subtypeRef != null)
				return false;
		} else if (!subtypeRef.equals(other.subtypeRef))
			return false;
		if (typeRef == null) {
			if (other.typeRef != null)
				return false;
		} else if (!typeRef.equals(other.typeRef))
			return false;
		return true;
	}	
	
}
