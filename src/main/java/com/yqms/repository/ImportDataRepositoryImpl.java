package com.yqms.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


public class ImportDataRepositoryImpl implements ImportDataRepository{
	
    @PersistenceContext
    private EntityManager entityManager;

	@Override
	public List<Object[]> getRecords(String tableName, String columns) {
		
        String selectStatement = "SELECT " + columns +" FROM " + tableName;

        Query query = entityManager.createNativeQuery(selectStatement);

        return query.getResultList();
	}
	
	@Override
	public int updateRecord(String tableName, String updateColumnsString, String id) {
		
        String updateStatement = "UPDATE " + tableName +" SET " + updateColumnsString + " WHERE ID='" + id + "'";

        int countUpdated = entityManager.createNativeQuery(updateStatement).executeUpdate();;

        return countUpdated;
	}
	
	@Override
	public int addRecord(String tableName, String insertColumnString, String insertValueString) {
		
        String insertStatement = "INSERT INTO " + tableName + "(" +insertColumnString + ") VALUES (" + insertValueString + ")";

        int countInserted = entityManager.createNativeQuery(insertStatement).executeUpdate();

        return countInserted;
	}


}
