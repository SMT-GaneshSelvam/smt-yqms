package com.yqms.service;

import java.util.List;

import com.yqms.model.Area;

public interface AreaService {	
	
	List<Area> getAllAreasForLocation(List<String> locationList);

}
