package com.yqms.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yqms.model.WorkpackType;
import com.yqms.repository.WorkpackTypeRepository;
import com.yqms.service.WorkpackTypeService;

@Service
public class WorkpackTypeServiceImpl implements WorkpackTypeService {
	
	@Autowired
	WorkpackTypeRepository workpackTypeRepository;

	@Override
	public List<WorkpackType> getAllWorkpackTypes() {

		List<WorkpackType> workpackTypeList  = workpackTypeRepository.findAll();		
		return workpackTypeList;
		
	}

}
