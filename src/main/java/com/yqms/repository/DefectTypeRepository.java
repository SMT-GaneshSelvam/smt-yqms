package com.yqms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yqms.model.DefectType;

public interface DefectTypeRepository extends JpaRepository<DefectType, String> {

}
