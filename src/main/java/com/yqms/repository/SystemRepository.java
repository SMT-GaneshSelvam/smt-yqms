package com.yqms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yqms.model.SubSystem;
import com.yqms.model.System;
import com.yqms.model.SystemIdentity;

public interface SystemRepository extends JpaRepository<System, SystemIdentity> {
	
	List<System> findBySystemIdentityUnitRefIn(List<String> unitRef);
}
