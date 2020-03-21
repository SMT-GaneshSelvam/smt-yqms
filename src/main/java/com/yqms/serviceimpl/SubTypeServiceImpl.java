package com.yqms.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yqms.model.SubType;
import com.yqms.repository.SubTypeRepository;
import com.yqms.service.SubTypeService;

@Service
public class SubTypeServiceImpl implements SubTypeService {
	
	@Autowired
	SubTypeRepository subTypeRepository;

	@Override
	public List<SubType> getAllSubTypesForType(String typeId) {

		List<SubType> subTypeList  = subTypeRepository.findBySubTypeIdentityTypeId(typeId);	
		return subTypeList;
		
	}

}
