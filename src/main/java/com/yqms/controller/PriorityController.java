package com.yqms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yqms.model.Priority;
import com.yqms.service.PriorityService;

@RestController
@RequestMapping(value = "/priority")
public class PriorityController {
	
	@Autowired
	private PriorityService priorityService;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ResponseEntity<List<Priority>> getAllPriorities() {
		
		List<Priority> priorityList = priorityService.getAllPriorities();
		return new ResponseEntity<>(priorityList, HttpStatus.OK);
		
	}

}
