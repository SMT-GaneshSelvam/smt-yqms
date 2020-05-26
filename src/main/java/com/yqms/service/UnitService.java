package com.yqms.service;

import java.util.List;

import com.yqms.model.Unit;

public interface UnitService {	
	
	List<Unit> getAllUnits();
	
	Unit addUnit(Unit unit);
	
	Unit getUnitById(String id);

}
