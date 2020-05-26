package com.yqms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yqms.model.Priority;

public interface PriorityRepository extends JpaRepository<Priority, String> {

}
