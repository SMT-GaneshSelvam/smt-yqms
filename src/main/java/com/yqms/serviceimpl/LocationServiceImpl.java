package com.yqms.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yqms.model.Location;
import com.yqms.repository.LocationRepository;
import com.yqms.service.LocationService;

@Service
public class LocationServiceImpl implements LocationService {
	
	@Autowired
	LocationRepository locationRepository;

	@Override
	public List<Location> getAllLocations() {

		List<Location> locationList  = locationRepository.findAll();		
		return locationList;
		
	}

	@Override
	public Location addLocation(Location location) {
		return locationRepository.save(location);
	}

	@Override
	public Location getLocationById(String id) {
		return locationRepository.findById(id).get();
	}

}
