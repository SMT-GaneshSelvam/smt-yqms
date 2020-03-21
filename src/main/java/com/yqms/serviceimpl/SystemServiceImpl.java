package com.yqms.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yqms.model.System;
import com.yqms.repository.SystemRepository;
import com.yqms.service.SystemService;

@Service
public class SystemServiceImpl implements SystemService {
	
	@Autowired
	SystemRepository systemRepository;

	@Override
	public List<System> getAllSystems() {

		List<System> systemList  = systemRepository.findAll();		
		return systemList;
		
	}

}
