package com.yqms.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yqms.model.Priority;
import com.yqms.repository.PriorityRepository;
import com.yqms.service.PriorityService;

@Service
public class PriorityServiceImpl implements PriorityService {
	
	@Autowired
	PriorityRepository priorityRepository;

	@Override
	public List<Priority> getAllPriorities() {

		List<Priority> priorityList  = priorityRepository.findAll();		
		return priorityList;
		
	}

}
