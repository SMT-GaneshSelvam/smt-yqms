package com.yqms.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yqms.model.CheckSheetItem;
import com.yqms.service.CheckSheetItemService;

@RestController
@RequestMapping(value = "/checkSheetItem")
public class CheckSheetItemController {
	
	@Autowired
	private CheckSheetItemService checkSheetItemService;
	
	@RequestMapping(value = "/{checkSheet}", method = RequestMethod.GET)
	public ResponseEntity<List<CheckSheetItem>> getCheckSheetItemById(@PathVariable String checkSheet) {
	
		List<CheckSheetItem> checkSheetItems = checkSheetItemService.getCheckSheetItemById(checkSheet);
		return new ResponseEntity<>(checkSheetItems, HttpStatus.OK);
		
	}

}
