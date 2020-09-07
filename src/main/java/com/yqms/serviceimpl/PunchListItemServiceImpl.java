package com.yqms.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yqms.model.PunchListItem;
import com.yqms.repository.PunchListItemRepository;
import com.yqms.service.PunchListItemService;

@Service
public class PunchListItemServiceImpl implements PunchListItemService {
	
	@Autowired
	PunchListItemRepository punchListItemRepository;

	@Override
	public List<PunchListItem> getPunchListItemByCheckSheetAndLineNo(String checkSheet, Long lineNo) {
		List<PunchListItem> punchListItems  = punchListItemRepository.findByPunchListItemIdentityChecksheetAndPunchListItemIdentityLineNoOrderByPunchListItemIdentityLineNoAsc(checkSheet, lineNo);
		return punchListItems;
	}

}
