package com.yqms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yqms.model.SubType;
import com.yqms.service.SubTypeService;

@RestController
@RequestMapping(value = "/subtype")
public class SubTypeController {
	
	@Autowired
	private SubTypeService subTypeService;
	
	@RequestMapping(value = "/{typeId}", method = RequestMethod.GET)
	public ResponseEntity<List<SubType>> getAllSubTypesForType(@PathVariable("typeId") String typeId) {
				
		List<SubType> subTypeList = subTypeService.getAllSubTypesForType(typeId);
		return new ResponseEntity<>(subTypeList, HttpStatus.OK);
		
	}

}
