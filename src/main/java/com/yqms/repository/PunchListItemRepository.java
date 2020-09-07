package com.yqms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.yqms.model.PunchListItem;
import com.yqms.model.PunchListItemIdentity;

public interface PunchListItemRepository extends JpaRepository<PunchListItem, PunchListItemIdentity> {

	List<PunchListItem> findByPunchListItemIdentityChecksheetAndPunchListItemIdentityLineNoOrderByPunchListItemIdentityLineNoAsc(String checkSheet, Long lineNo);	
	
}
