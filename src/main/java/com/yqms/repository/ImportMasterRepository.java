package com.yqms.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.yqms.model.ImportMaster;

public interface ImportMasterRepository extends JpaRepository<ImportMaster, String>, ImportDataRepository {
	
}
