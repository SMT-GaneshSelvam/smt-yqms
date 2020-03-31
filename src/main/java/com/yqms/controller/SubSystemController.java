package com.yqms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yqms.model.SubSystem;
import com.yqms.service.SubSystemService;

@RestController
@RequestMapping(value = "/subsystem")
public class SubSystemController {
	
	@Autowired
	private SubSystemService subSystemService;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ResponseEntity<List<SubSystem>> getAllSubSystemsForSystem(@RequestParam List<String> systemList) {
				
		List<SubSystem> subSystemList = subSystemService.getAllSubSystemsForSystem(systemList);
		return new ResponseEntity<>(subSystemList, HttpStatus.OK);
		
	}

}
