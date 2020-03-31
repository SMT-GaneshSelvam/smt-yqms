package com.yqms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yqms.dto.CheckSheetFilter;
import com.yqms.model.CheckSheet;
import com.yqms.service.CheckSheetService;

@RestController
@RequestMapping(value = "/checksheet")
public class CheckSheetController {
	
	@Autowired
	private CheckSheetService checkSheetService;
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	public ResponseEntity<List<CheckSheet>> getAllChecksheets(@RequestBody CheckSheetFilter checkSheetFilter) {
		
		//System.out.println("SMT" + checkSheetFilter.getSystem().get(0));
		
		List<CheckSheet> checkSheetList = checkSheetService.getAllCheckSheets(checkSheetFilter);
		return new ResponseEntity<>(checkSheetList, HttpStatus.OK);
		
	}

}
