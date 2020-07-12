package com.yqms.repository;

import java.util.List;

public interface ImportDataRepository {
	
	List getRecords(String tableName, String columns);

	int updateRecord(String tableName, String updateColumns, String id);

	int addRecord(String tableName, String insertColumnString, String insertValueString);

}
