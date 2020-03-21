package com.yqms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yqms.model.Area;
import com.yqms.model.AreaIdentity;

public interface AreaRepository extends JpaRepository<Area, AreaIdentity> {
	
	List<Area> findByAreaIdentityLocationId(Long locationId);

}
