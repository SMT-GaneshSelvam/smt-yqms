package com.yqms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yqms.model.Discipline;
import com.yqms.service.DisciplineService;

@RestController
@RequestMapping(value = "/discipline")
public class DisciplineController {
	
	@Autowired
	private DisciplineService disciplineService;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ResponseEntity<List<Discipline>> getAllDisciplines() {
		
		List<Discipline> disciplineList = disciplineService.getAllDisciplines();
		return new ResponseEntity<>(disciplineList, HttpStatus.OK);
		
	}

}
