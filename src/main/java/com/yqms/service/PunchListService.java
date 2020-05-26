package com.yqms.service;

import java.util.List;

import com.yqms.dto.PunchListFilter;
import com.yqms.model.PunchList;

public interface PunchListService {	
	
	List<PunchList> getAllPunchLists(PunchListFilter punchListFilter);

}
