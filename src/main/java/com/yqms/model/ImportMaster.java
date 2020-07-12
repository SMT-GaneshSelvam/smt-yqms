package com.yqms.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "importMaster")
public class ImportMaster {

	@Id
	private String id;
	private String importColumns;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getImportColumns() {
		return importColumns;
	}

	public void setImportColumns(String importColumns) {
		this.importColumns = importColumns;
	}

}
