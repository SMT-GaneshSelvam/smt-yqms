package com.yqms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.yqms.model.CheckSheetItem;
import com.yqms.model.CheckSheetItemIdentity;

public interface CheckSheetItemRepository extends JpaRepository<CheckSheetItem, CheckSheetItemIdentity> {

	List<CheckSheetItem> findByCheckSheetItemIdentityChecksheetOrderByCheckSheetItemIdentityLineNoAsc(String checkSheet);	
	
}
