package com.yqms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yqms.model.Contractor;
import com.yqms.service.ContractorService;

@RestController
@RequestMapping(value = "/contractor")
public class ContractorController {
	
	@Autowired
	private ContractorService contractorService;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ResponseEntity<List<Contractor>> getAllContractors() {
		
		List<Contractor> contractorList = contractorService.getAllContractors();
		return new ResponseEntity<>(contractorList, HttpStatus.OK);
		
	}

}
