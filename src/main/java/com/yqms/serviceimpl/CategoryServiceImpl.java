package com.yqms.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yqms.model.Category;
import com.yqms.repository.CategoryRepository;
import com.yqms.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	CategoryRepository categoryRepository;

	@Override
	public List<Category> getAllCategories() {

		List<Category> categoryList  = categoryRepository.findAll();		
		return categoryList;
		
	}

}
