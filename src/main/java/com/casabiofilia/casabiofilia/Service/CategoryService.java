package com.casabiofilia.casabiofilia.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.casabiofilia.casabiofilia.Entity.Category;

import com.casabiofilia.casabiofilia.Repository.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;
	
	//Get
	public List<Category> getAllCategory(){
		return categoryRepository.findAll();
	}
	//Get by Id
		public Category getCategoryById(Long i) {
			return categoryRepository.findById(i).orElse(null);
		}
		//Post
		public Category createCategory(Category category) {
			return categoryRepository.save(category);
		}
		
		//Put
		public Category updateCategory(Category category) {
			return categoryRepository.save(category);
		}
		//Delete
		public void deleteCategory(Long id) {
			categoryRepository.deleteById(id);
		}
}