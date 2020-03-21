package com.yqms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yqms.model.CheckSheetType;
import com.yqms.service.CheckSheetTypeService;

@RestController
@RequestMapping(value = "/checksheettype")
public class CheckSheetTypeController {
	
	@Autowired
	private CheckSheetTypeService checkSheetTypeService;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ResponseEntity<List<CheckSheetType>> getAllCheckSheetTypes() {
		
		List<CheckSheetType> checkSheetTypeList = checkSheetTypeService.getAllCheckSheetTypes();
		return new ResponseEntity<>(checkSheetTypeList, HttpStatus.OK);
		
	}

}
