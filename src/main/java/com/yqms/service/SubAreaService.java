package com.yqms.service;

import java.util.List;

import com.yqms.model.SubArea;

public interface SubAreaService {	
	
	List<SubArea> getAllSubAreasForLocationAndArea(Long locationId, Long areaId);

}
