package com.yqms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yqms.dto.PunchListFilter;
import com.yqms.model.PunchList;
import com.yqms.service.PunchListService;

@RestController
@RequestMapping(value = "/punchlist")
public class PunchListController {
	
	@Autowired
	private PunchListService punchListService;
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	public ResponseEntity<List<PunchList>> getAllChecksheets(@RequestBody PunchListFilter punchListFilter) {
		
		//System.out.println("SMT" + punchListFilter.getSystem().get(0));
		
		List<PunchList> punchListList = punchListService.getAllPunchLists(punchListFilter);
		return new ResponseEntity<>(punchListList, HttpStatus.OK);
		
	}

}
