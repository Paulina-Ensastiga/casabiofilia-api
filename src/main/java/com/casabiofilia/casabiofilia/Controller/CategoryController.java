package com.casabiofilia.casabiofilia.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.casabiofilia.casabiofilia.Entity.Category;

import com.casabiofilia.casabiofilia.Service.CategoryService;
@RequestMapping(path="/casabiofilia/category")
@RestController
class CategoryController {
	
	private final CategoryService categoryService; 

	@Autowired
	public CategoryController(CategoryService categoryService) {
		this.categoryService = categoryService;
	}
	@GetMapping
	public List<Category> getCategory(){
		return categoryService.getAllCategory();
		
	}
	//Get individual
	@GetMapping("/{id}")
	public Category getCategoryById(@PathVariable Long id) {
		return categoryService.getCategoryById(id);
	}
	
	@PostMapping
	public Category createCategory(@RequestBody Category category) {
		return categoryService.createCategory(category);
	}
	
	@PutMapping
	public Category updateCategory(@RequestBody Category category) {
		return categoryService.updateCategory(category);
	}
	//Delete mappping
	@DeleteMapping("/{id}")
	public void deleteCategory(@PathVariable Long id) {
		categoryService.deleteCategory(id);
	}
}