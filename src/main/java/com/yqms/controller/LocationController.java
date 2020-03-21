package com.yqms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yqms.model.Location;
import com.yqms.service.LocationService;

@RestController
@RequestMapping(value = "/location")
public class LocationController {
	
	@Autowired
	private LocationService locationService;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ResponseEntity<List<Location>> getAllLocations() {
		
		List<Location> locationList = locationService.getAllLocations();
		return new ResponseEntity<>(locationList, HttpStatus.OK);
		
	}

}
