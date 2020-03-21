package com.yqms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yqms.model.System;
import com.yqms.service.SystemService;

@RestController
@RequestMapping(value = "/system")
public class SystemController {
	
	@Autowired
	private SystemService systemService;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ResponseEntity<List<System>> getAllSystems() {
		
		List<System> systemList = systemService.getAllSystems();
		return new ResponseEntity<>(systemList, HttpStatus.OK);
		
	}

}
