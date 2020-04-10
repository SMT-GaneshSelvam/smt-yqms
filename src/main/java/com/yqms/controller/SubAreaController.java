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

import com.yqms.model.SubArea;
import com.yqms.service.SubAreaService;

@RestController
@RequestMapping(value = "/subarea")
public class SubAreaController {
	
	@Autowired
	private SubAreaService subAreaService;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ResponseEntity<List<SubArea>> getAllSubAreasForLocationAndArea(@RequestParam List<String> locationList, @RequestParam List<String> areaList) {
				
		List<SubArea> subAreaList = subAreaService.getAllSubAreasForLocationAndArea(locationList, areaList);
		return new ResponseEntity<>(subAreaList, HttpStatus.OK);
		
	}

}
