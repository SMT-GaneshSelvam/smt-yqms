package com.yqms.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yqms.model.Unit;
import com.yqms.repository.UnitRepository;
import com.yqms.service.UnitService;

@Service
public class UnitServiceImpl implements UnitService {
	
	@Autowired
	UnitRepository unitRepository;

	@Override
	public List<Unit> getAllUnits() {

		List<Unit> unitList  = unitRepository.findAll();		
		return unitList;
		
	}

}
