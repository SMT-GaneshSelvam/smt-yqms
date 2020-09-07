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
public class PunchListItemIdentity implements Serializable {
	
	@JsonIgnore
	private String checksheet;	
	@JsonIgnore
	private Long lineNo;
	@JsonValue
	private Long punchNo;
	
	public PunchListItemIdentity() {
		super();
	}

	public PunchListItemIdentity(String checksheet, Long lineNo, Long punchNo) {
		super();
		this.checksheet = checksheet;
		this.lineNo = lineNo;
		this.punchNo = punchNo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((checksheet == null) ? 0 : checksheet.hashCode());
		result = prime * result + ((lineNo == null) ? 0 : lineNo.hashCode());
		result = prime * result + ((punchNo == null) ? 0 : punchNo.hashCode());
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
		PunchListItemIdentity other = (PunchListItemIdentity) obj;
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
		if (punchNo == null) {
			if (other.punchNo != null)
				return false;
		} else if (!punchNo.equals(other.punchNo))
			return false;
		return true;
	}
	
}
