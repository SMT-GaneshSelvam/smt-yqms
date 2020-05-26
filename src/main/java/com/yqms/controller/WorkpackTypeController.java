package com.yqms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yqms.model.WorkpackType;
import com.yqms.service.WorkpackTypeService;

@RestController
@RequestMapping(value = "/workpacktype")
public class WorkpackTypeController {
	
	@Autowired
	private WorkpackTypeService workpackTypeService;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ResponseEntity<List<WorkpackType>> getAllWorkpackTypes() {
		
		List<WorkpackType> workpackTypeList = workpackTypeService.getAllWorkpackTypes();
		return new ResponseEntity<>(workpackTypeList, HttpStatus.OK);
		
	}

}
