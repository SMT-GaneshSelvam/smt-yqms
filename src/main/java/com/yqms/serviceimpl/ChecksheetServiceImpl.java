package com.yqms.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yqms.model.Checksheet;
import com.yqms.repository.ChecksheetRepository;
import com.yqms.service.ChecksheetService;

@Service
public class ChecksheetServiceImpl implements ChecksheetService {
	
	@Autowired
	ChecksheetRepository checksheetRepository;

	@Override
	public List<Checksheet> getAllChecksheets() {

		List<Checksheet> checksheetList  = checksheetRepository.findAll();		
		return checksheetList;
		
	}

}
