package com.yqms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yqms.model.Location;

public interface LocationRepository extends JpaRepository<Location, String> {

}
