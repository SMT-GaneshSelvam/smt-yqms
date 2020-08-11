package com.yqms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yqms.dto.ImportData;
import com.yqms.service.ImportDataService;
import com.yqms.service.ImportMasterService;

@RestController
@RequestMapping(value = "/importdata")
public class ImportDataController {
	
	@Autowired
	private ImportDataService importDataService;
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	public ResponseEntity<ImportData> saveMasterData(@RequestBody ImportData importData) throws Exception {
		
		ImportData importDataReturned= importDataService.saveMasterData(importData);
		return new ResponseEntity<>(importDataReturned, HttpStatus.OK);
		
	}
	
	@RequestMapping(value = "/{table}", method = RequestMethod.GET)
	public ResponseEntity<Integer> getRecordsCount(@PathVariable String table) throws Exception {
		
		Integer count= importDataService.getRecordsCount(table);
		return new ResponseEntity<>(count, HttpStatus.OK);
		
	}

}
