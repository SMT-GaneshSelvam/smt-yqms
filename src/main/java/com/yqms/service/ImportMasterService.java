package com.yqms.service;

import java.util.List;

import com.yqms.model.ImportMaster;

public interface ImportMasterService {	
	
	List<ImportMaster> getAllImportMasters();
	
	ImportMaster addImportMaster(ImportMaster importMaster);
	
	ImportMaster getImportMasterById(String id);

}
