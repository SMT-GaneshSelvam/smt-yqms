package com.yqms.dto;

import java.util.List;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ImportData {
	
	String tableName;
	List<Map<String,String>> data;

}
