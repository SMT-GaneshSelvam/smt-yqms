package com.yqms.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yqms.model.DefectType;
import com.yqms.repository.DefectTypeRepository;
import com.yqms.service.DefectTypeService;

@Service
public class DefectTypeServiceImpl implements DefectTypeService {
	
	@Autowired
	DefectTypeRepository defectTypeRepository;

	@Override
	public List<DefectType> getAllDefectTypes() {

		List<DefectType> defectTypeList  = defectTypeRepository.findAll();		
		return defectTypeList;
		
	}

}
