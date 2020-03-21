package com.yqms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yqms.model.TagGroup;
import com.yqms.service.TagGroupService;

@RestController
@RequestMapping(value = "/taggroup")
public class TagGroupController {
	
	@Autowired
	private TagGroupService tagGroupService;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ResponseEntity<List<TagGroup>> getAllTagGroups() {
		
		List<TagGroup> tagGroupList = tagGroupService.getAllTagGroups();
		return new ResponseEntity<>(tagGroupList, HttpStatus.OK);
		
	}

}
