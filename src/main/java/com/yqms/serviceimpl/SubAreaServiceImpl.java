package com.yqms.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yqms.model.SubArea;
import com.yqms.repository.SubAreaRepository;
import com.yqms.service.SubAreaService;

@Service
public class SubAreaServiceImpl implements SubAreaService {
	
	@Autowired
	SubAreaRepository subAreaRepository;

	@Override
	public List<SubArea> getAllSubAreasForLocationAndArea(List<Long> locationList, List<Long> areaList) {

		List<SubArea> subAreaList  = subAreaRepository.findBySubAreaIdentityLocationIdInAndSubAreaIdentityAreaIdIn(locationList, areaList);	
		return subAreaList;
		
	}

}
