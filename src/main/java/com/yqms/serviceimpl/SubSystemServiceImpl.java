package com.yqms.serviceimpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yqms.model.SubSystem;
import com.yqms.repository.SubSystemRepository;
import com.yqms.service.SubSystemService;

@Service
public class SubSystemServiceImpl implements SubSystemService {
	
	@Autowired
	SubSystemRepository subSystemRepository;

	@Override
	public List<SubSystem> getAllSubSystemsForSystem(String systemId) {
		
		List<String> systemList =  new ArrayList<String>();		
		systemList = Arrays.asList(systemId.split(","));	

		List<SubSystem> subSystemList  = subSystemRepository.findBySubSystemIdentitySystemIdIn(systemList);	
		return subSystemList;
		
	}

}
