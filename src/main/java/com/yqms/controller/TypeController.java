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

import com.yqms.model.Type;
import com.yqms.service.TypeService;

@RestController
@RequestMapping(value = "/type")
public class TypeController {
	
	@Autowired
	private TypeService typeService;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ResponseEntity<List<Type>> getAllTypes() {
		
		List<Type> typeList = typeService.getAllTypes();
		return new ResponseEntity<>(typeList, HttpStatus.OK);
		
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Type> getTypeById(@PathVariable String id) {		
		Type type = typeService.getTypeById(id);
		return new ResponseEntity<>(type, HttpStatus.OK);
		
	}
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	public ResponseEntity<Type> addType(@RequestBody Type type) {
		return new ResponseEntity<>(typeService.addType(type), HttpStatus.CREATED);
	}

}
