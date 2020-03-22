package com.yqms.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yqms.model.Area;
import com.yqms.repository.AreaRepository;
import com.yqms.service.AreaService;

@Service
public class AreaServiceImpl implements AreaService {
	
	@Autowired
	AreaRepository areaRepository;

	@Override
	public List<Area> getAllAreasForLocation(List<Long> locationList) {
		
		List<Area> areaList  = areaRepository.findByAreaIdentityLocationIdIn(locationList);	
		return areaList;
		
	}

}
