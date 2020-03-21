package com.yqms.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yqms.model.Type;
import com.yqms.repository.TypeRepository;
import com.yqms.service.TypeService;

@Service
public class TypeServiceImpl implements TypeService {
	
	@Autowired
	TypeRepository typeRepository;

	@Override
	public List<Type> getAllTypes() {

		List<Type> typeList  = typeRepository.findAll();		
		return typeList;
		
	}

}
