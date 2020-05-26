package com.yqms.service;

import java.util.List;

import com.yqms.model.Discipline;

public interface DisciplineService {	
	
	List<Discipline> getAllDisciplines();
	
	Discipline addDiscipline(Discipline discipline);
	
	Discipline getDisciplineById(String id);

}
