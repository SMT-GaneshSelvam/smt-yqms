package com.yqms.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yqms.model.Category;
import com.yqms.model.CheckSheetItem;
import com.yqms.repository.CategoryRepository;
import com.yqms.repository.CheckSheetItemRepository;
import com.yqms.service.CheckSheetItemService;

@Service
public class CheckSheetItemServiceImpl implements CheckSheetItemService {
	
	@Autowired
	CheckSheetItemRepository checkSheetItemRepository;

	@Override
	public List<CheckSheetItem> getCheckSheetItemById(String checkSheet) {

		List<CheckSheetItem> checkSheetItems  = checkSheetItemRepository.findByCheckSheetItemIdentityChecksheetOrderByCheckSheetItemIdentityLineNoAsc(checkSheet);
		return checkSheetItems;
	}

}
