package com.yqms.service;

import java.util.List;

import com.yqms.model.SubSystem;

public interface SubSystemService {	
	
	List<SubSystem> getAllSubSystemsForSystem(List<String> unitRef, List<String> systemRef);

}
