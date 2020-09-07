package com.yqms.service;

import java.util.List;

import com.yqms.model.PunchListItem;

public interface PunchListItemService {	
	
	List<PunchListItem> getPunchListItemByCheckSheetAndLineNo(String checkSheet, Long lineNo);

}
