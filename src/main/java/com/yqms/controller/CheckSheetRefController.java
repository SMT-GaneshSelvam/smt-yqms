package com.yqms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yqms.model.CheckSheetRef;
import com.yqms.service.CheckSheetRefService;

@RestController
@RequestMapping(value = "/checksheetref")
public class CheckSheetRefController {
	
	@Autowired
	private CheckSheetRefService checkSheetRefService;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ResponseEntity<List<CheckSheetRef>> getAllCheckSheetRefs() {
		
		List<CheckSheetRef> checkSheetRefList = checkSheetRefService.getAllCheckSheetRefs();
		return new ResponseEntity<>(checkSheetRefList, HttpStatus.OK);
		
	}

}
