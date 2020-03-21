package com.yqms.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yqms.model.CheckSheetType;
import com.yqms.repository.CheckSheetTypeRepository;
import com.yqms.service.CheckSheetTypeService;

@Service
public class CheckSheetTypeServiceImpl implements CheckSheetTypeService {
	
	@Autowired
	CheckSheetTypeRepository checkSheetTypeRepository;

	@Override
	public List<CheckSheetType> getAllCheckSheetTypes() {

		List<CheckSheetType> checkSheetTypeList  = checkSheetTypeRepository.findAll();		
		return checkSheetTypeList;
		
	}

}
