package com.yqms.service;

import java.util.List;

import com.yqms.dto.CheckSheetFilter;
import com.yqms.model.CheckSheet;

public interface CheckSheetService {	
	
	List<CheckSheet> getAllCheckSheets(CheckSheetFilter checkSheetFilter);

}
