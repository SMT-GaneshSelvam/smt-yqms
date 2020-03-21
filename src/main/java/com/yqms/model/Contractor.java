package com.yqms.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contractor")
public class Contractor {

	@Id
	private Long id;
	private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return name;
	}

	public void setDescription(String name) {
		this.name = name;
	}

}
