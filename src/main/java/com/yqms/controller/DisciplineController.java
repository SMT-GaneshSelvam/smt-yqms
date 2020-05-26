package com.yqms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yqms.model.Discipline;
import com.yqms.model.Type;
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
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Discipline> getDisciplineById(@PathVariable String id) {		
		Discipline discipline = disciplineService.getDisciplineById(id);
		return new ResponseEntity<>(discipline, HttpStatus.OK);
		
	}
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	public ResponseEntity<Discipline> addDiscipline(@RequestBody Discipline discipline) {
		return new ResponseEntity<>(disciplineService.addDiscipline(discipline), HttpStatus.CREATED);
	}


}
