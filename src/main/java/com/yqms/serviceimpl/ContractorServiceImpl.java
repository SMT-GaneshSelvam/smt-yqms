package com.yqms.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yqms.model.Contractor;
import com.yqms.repository.ContractorRepository;
import com.yqms.service.ContractorService;

@Service
public class ContractorServiceImpl implements ContractorService {
	
	@Autowired
	ContractorRepository contractorRepository;

	@Override
	public List<Contractor> getAllContractors() {

		List<Contractor> contractorList  = contractorRepository.findAll();		
		return contractorList;
		
	}

}
