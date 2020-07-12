package com.yqms.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yqms.model.ImportMaster;
import com.yqms.repository.ImportMasterRepository;
import com.yqms.service.ImportMasterService;

@Service
public class ImportMasterServiceImpl implements ImportMasterService {
	
	@Autowired
	ImportMasterRepository importMasterRepository;

	@Override
	public List<ImportMaster> getAllImportMasters() {

		List<ImportMaster> importMasterList  = importMasterRepository.findAll();		
		return importMasterList;
		
	}

	@Override
	public ImportMaster addImportMaster(ImportMaster importMaster) {
		return importMasterRepository.save(importMaster);
	}

	@Override
	public ImportMaster getImportMasterById(String id) {
		return importMasterRepository.findById(id).get();
	}

}
