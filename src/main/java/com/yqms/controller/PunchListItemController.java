package com.yqms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yqms.model.PunchListItem;
import com.yqms.service.PunchListItemService;

@RestController
@RequestMapping(value = "/checkSheetItem")
public class PunchListItemController {
	
	@Autowired
	private PunchListItemService punchListItemService;
	
	@RequestMapping(value = "/{checkSheet}/{lineNo}", method = RequestMethod.GET)
	public ResponseEntity<List<PunchListItem>> getPunchListItemByCheckSheetAndLineNo(@PathVariable String checkSheet, @PathVariable Long lineNo) {
	
		List<PunchListItem> punchListItems = punchListItemService.getPunchListItemByCheckSheetAndLineNo(checkSheet,lineNo);
		return new ResponseEntity<>(punchListItems, HttpStatus.OK);
		
	}

}
