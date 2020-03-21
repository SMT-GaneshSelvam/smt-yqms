package com.yqms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

}
