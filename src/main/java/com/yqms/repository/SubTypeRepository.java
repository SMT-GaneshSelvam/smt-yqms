package com.yqms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yqms.model.SubType;
import com.yqms.model.SubTypeIdentity;

public interface SubTypeRepository extends JpaRepository<SubType, SubTypeIdentity> {
	
	List<SubType> findBySubTypeIdentityTypeId(String typeId);

}
