package com.yqms.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yqms.model.Discipline;
import com.yqms.repository.DisciplineRepository;
import com.yqms.service.DisciplineService;

@Service
public class DisciplineServiceImpl implements DisciplineService {
	
	@Autowired
	DisciplineRepository disciplineRepository;

	@Override
	public List<Discipline> getAllDisciplines() {

		List<Discipline> disciplineList  = disciplineRepository.findAll();		
		return disciplineList;
		
	}

}
