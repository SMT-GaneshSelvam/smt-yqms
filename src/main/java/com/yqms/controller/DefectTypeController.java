package com.yqms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yqms.model.DefectType;
import com.yqms.service.DefectTypeService;

@RestController
@RequestMapping(value = "/defecttype")
public class DefectTypeController {
	
	@Autowired
	private DefectTypeService defectTypeService;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ResponseEntity<List<DefectType>> getAllDefectTypes() {
		
		List<DefectType> defectTypeList = defectTypeService.getAllDefectTypes();
		return new ResponseEntity<>(defectTypeList, HttpStatus.OK);
		
	}

}
