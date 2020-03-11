package com.yqms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yqms.model.Checksheet;
import com.yqms.service.ChecksheetService;

@RestController
@RequestMapping(value = "/checksheet")
public class ChecksheetController {
	
	@Autowired
	private ChecksheetService checksheetService;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ResponseEntity<List<Checksheet>> getAllChecksheet() {
		
		List<Checksheet> checksheetList = checksheetService.getAllChecksheets();
		return new ResponseEntity<>(checksheetList, HttpStatus.OK);
		
	}

}
