package com.yqms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yqms.model.Area;
import com.yqms.service.AreaService;

@RestController
@RequestMapping(value = "/area")
public class AreaController {
	
	@Autowired
	private AreaService areaService;
	
	@RequestMapping(value = "/{locationId}", method = RequestMethod.GET)
	public ResponseEntity<List<Area>> getAllAreas(@PathVariable("locationId") Long locationId) {
				
		List<Area> areaList = areaService.getAllAreasForLocation(locationId);
		return new ResponseEntity<>(areaList, HttpStatus.OK);
		
	}

}
