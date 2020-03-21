package com.yqms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yqms.model.Unit;
import com.yqms.service.UnitService;

@RestController
@RequestMapping(value = "/unit")
public class UnitController {
	
	@Autowired
	private UnitService unitService;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ResponseEntity<List<Unit>> getAllUnits() {
		
		List<Unit> unitList = unitService.getAllUnits();
		return new ResponseEntity<>(unitList, HttpStatus.OK);
		
	}

}
