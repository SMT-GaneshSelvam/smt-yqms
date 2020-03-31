package com.yqms.service;

import java.util.List;

import com.yqms.model.SubType;

public interface SubTypeService {	
	
	List<SubType> getAllSubTypesForType(List<String> typeList);

}
