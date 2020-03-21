package com.yqms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yqms.model.SubArea;
import com.yqms.model.SubAreaIdentity;

public interface SubAreaRepository extends JpaRepository<SubArea, SubAreaIdentity> {
	
	List<SubArea> findBySubAreaIdentityLocationIdAndSubAreaIdentityAreaId(Long locationId,Long areaId);

}
