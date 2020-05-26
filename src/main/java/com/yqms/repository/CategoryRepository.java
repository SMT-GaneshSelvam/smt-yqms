package com.yqms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yqms.model.Category;

public interface CategoryRepository extends JpaRepository<Category, String> {

}
