package com.yqms.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;


public class ImportDataRepositoryImpl implements ImportDataRepository{
	
    @PersistenceContext
    private EntityManager entityManager;
    
	@Override
	public Integer getRecordsCount(String tableName) {
		
        String selectStatement = "SELECT COUNT(*) FROM " + tableName;

        Query query = entityManager.createNativeQuery(selectStatement);

        return Integer.valueOf(query.getSingleResult().toString());
	}
	
	@Override
	@Transactional
	public Integer deleteRecords(String tableName) {
		
        String deleteStatement = "DELETE FROM " + tableName;

        Query query = entityManager.createNativeQuery(deleteStatement);

        return Integer.valueOf(query.executeUpdate());
	}

	@Override
	public List<Object[]> getRecords(String tableName, String columns) {
		
        String selectStatement = "SELECT " + columns +" FROM " + tableName;

        Query query = entityManager.createNativeQuery(selectStatement);

        return query.getResultList();
	}
	
	@Override
	public int updateRecord(String tableName, String updateColumnsString, String condition) {
		
        String updateStatement = "UPDATE " + tableName +" SET " + updateColumnsString + " WHERE " + condition;

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
