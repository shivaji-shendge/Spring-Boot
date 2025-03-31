package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Category;
import com.example.demo.repository.CategoryRepository;

@Service
public class CategoryService {
	 @Autowired
	    private CategoryRepository categoryRepository;

	    public List<Category> getAllCategories() {
	        return categoryRepository.findAll();
	    }

	    public Category getCategoryById(Long id) {
	        if (categoryRepository.existsById(id)) {
	            return categoryRepository.getById(id);
	        }
	        return null;
	    }

	    public Category createCategory(Category category) {
	        return categoryRepository.save(category);
	    }

	    public Category updateCategory(Long id, Category categoryDetails) {
	        if (!categoryRepository.existsById(id)) {
	            return null; 
	        }
	        Category category = categoryRepository.getById(id);
	        category.setName(categoryDetails.getName());
	        return categoryRepository.save(category);
	    }

	    public String deleteCategory(Long id) {
	        if (categoryRepository.existsById(id)) {
	            categoryRepository.deleteById(id);
	            return "Category deleted successfully";
	        }
	        return "Category not found";
	    }

}
