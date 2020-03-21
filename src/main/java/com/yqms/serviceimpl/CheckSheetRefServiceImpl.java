package com.yqms.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yqms.model.CheckSheetRef;
import com.yqms.repository.CheckSheetRefRepository;
import com.yqms.service.CheckSheetRefService;

@Service
public class CheckSheetRefServiceImpl implements CheckSheetRefService {
	
	@Autowired
	CheckSheetRefRepository checkSheetRefRepository;

	@Override
	public List<CheckSheetRef> getAllCheckSheetRefs() {

		List<CheckSheetRef> typeList  = checkSheetRefRepository.findAll();		
		return typeList;
		
	}

}
