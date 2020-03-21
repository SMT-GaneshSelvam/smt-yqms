package com.yqms.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yqms.model.CheckSheet;
import com.yqms.repository.CheckSheetRepository;
import com.yqms.service.CheckSheetService;

@Service
public class CheckSheetServiceImpl implements CheckSheetService {
	
	@Autowired
	CheckSheetRepository checkSheetRepository;

	@Override
	public List<CheckSheet> getAllCheckSheets() {

		List<CheckSheet> checksheetList  = checkSheetRepository.findAll();		
		return checksheetList;
		
	}

}
