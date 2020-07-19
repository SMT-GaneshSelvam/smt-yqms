package com.yqms.model;

import java.util.List;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "importMaster")
@Getter
@Setter
public class ImportMaster {

	@Id
	private String id;
	private String importColumns;
	private String importPrimaryKeys;

}
