package com.yqms.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yqms.model.ResponsibleGroup;
import com.yqms.repository.ResponsibleGroupRepository;
import com.yqms.service.ResponsibleGroupService;

@Service
public class ResponsibleGroupServiceImpl implements ResponsibleGroupService {
	
	@Autowired
	ResponsibleGroupRepository responsibleGroupRepository;

	@Override
	public List<ResponsibleGroup> getAllResponsibleGroups() {

		List<ResponsibleGroup> responsibleGroupList  = responsibleGroupRepository.findAll();		
		return responsibleGroupList;
		
	}

}
