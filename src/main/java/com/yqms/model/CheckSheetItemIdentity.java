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
public class CheckSheetItemIdentity implements Serializable {
	
	@JsonIgnore
	private String checksheet;	
	@JsonValue
	private Long lineNo;
	
	public CheckSheetItemIdentity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CheckSheetItemIdentity(String checksheet, Long lineNo) {
		super();
		this.checksheet = checksheet;
		this.lineNo = lineNo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((checksheet == null) ? 0 : checksheet.hashCode());
		result = prime * result + ((lineNo == null) ? 0 : lineNo.hashCode());
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
		CheckSheetItemIdentity other = (CheckSheetItemIdentity) obj;
		if (checksheet == null) {
			if (other.checksheet != null)
				return false;
		} else if (!checksheet.equals(other.checksheet))
			return false;
		if (lineNo == null) {
			if (other.lineNo != null)
				return false;
		} else if (!lineNo.equals(other.lineNo))
			return false;
		return true;
	}

}
