package com.yqms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yqms.model.SubSystem;
import com.yqms.model.SubSystemIdentity;

public interface SubSystemRepository extends JpaRepository<SubSystem, SubSystemIdentity> {	

	List<SubSystem> findBySubSystemIdentitySystemIdIn(List<String> systemId);

}
