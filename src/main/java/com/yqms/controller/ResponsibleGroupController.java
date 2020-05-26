package com.yqms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yqms.model.ResponsibleGroup;
import com.yqms.service.ResponsibleGroupService;

@RestController
@RequestMapping(value = "/responsiblegroup")
public class ResponsibleGroupController {
	
	@Autowired
	private ResponsibleGroupService responsibleGroupService;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ResponseEntity<List<ResponsibleGroup>> getAllResponsibleGroups() {
		
		List<ResponsibleGroup> responsibleGroupList = responsibleGroupService.getAllResponsibleGroups();
		return new ResponseEntity<>(responsibleGroupList, HttpStatus.OK);
		
	}

}
