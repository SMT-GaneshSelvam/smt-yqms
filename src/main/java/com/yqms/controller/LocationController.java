package com.yqms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Location> getLocationById(@PathVariable String id) {		
		Location location = locationService.getLocationById(id);
		return new ResponseEntity<>(location, HttpStatus.OK);
		
	}
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	public ResponseEntity<Location> addLocation(@RequestBody Location location) {
		return new ResponseEntity<>(locationService.addLocation(location), HttpStatus.CREATED);
	}

}
