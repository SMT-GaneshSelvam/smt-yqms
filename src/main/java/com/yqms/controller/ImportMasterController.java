package com.yqms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yqms.model.ImportMaster;
import com.yqms.service.ImportMasterService;

@RestController
@RequestMapping(value = "/importmaster")
public class ImportMasterController {
	
	@Autowired
	private ImportMasterService importMasterService;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ResponseEntity<List<ImportMaster>> getAllTypes() {
		
		List<ImportMaster> importMasterList = importMasterService.getAllImportMasters();
		return new ResponseEntity<>(importMasterList, HttpStatus.OK);
		
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<ImportMaster> getTypeById(@PathVariable String id) {		
		ImportMaster importMaster = importMasterService.getImportMasterById(id);
		return new ResponseEntity<>(importMaster, HttpStatus.OK);
		
	}
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	public ResponseEntity<ImportMaster> addType(@RequestBody ImportMaster importMaster) {
		return new ResponseEntity<>(importMasterService.addImportMaster(importMaster), HttpStatus.CREATED);
	}

}
