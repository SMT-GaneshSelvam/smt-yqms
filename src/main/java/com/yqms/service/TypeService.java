package com.yqms.service;

import java.util.List;

import com.yqms.model.Type;

public interface TypeService {	
	
	List<Type> getAllTypes();
	
	Type addType(Type type);
	
	Type getTypeById(String id);

}
