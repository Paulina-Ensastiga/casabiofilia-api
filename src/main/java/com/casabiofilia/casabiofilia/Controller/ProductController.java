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
import com.casabiofilia.casabiofilia.Entity.Product;
import com.casabiofilia.casabiofilia.Service.CategoryService;
import com.casabiofilia.casabiofilia.Service.ProductService;

	@RequestMapping(path="/casabiofilia/product")
	
	
	@RestController
	
	
	public class ProductController {
	private final ProductService productService;
	private final CategoryService categoryService;


	@Autowired

	@GetMapping
	public List<Product> getProduct(){
		return productService.getAllProduct();
		
	}

	public ProductController(ProductService productService, CategoryService categoryService) {
		super();
		this.productService = productService;
		this.categoryService = categoryService;
	}

	//Get individual
	@GetMapping("/{id}")
	public Product getProductById(@PathVariable Long id) {
		return productService.getProductById(id);
	}
	
	@PostMapping
	public Product createProduct(@RequestBody Product product) {
		//Obtener category
		Category persistenCategory = categoryService.getCategoryById(product.getCategory().getId_category());
				
		
		
		
		return productService.createProduct(product);
	}
	
	@PutMapping
	public Product updateProduct(@RequestBody Product product) {
		return productService.updateProduct(product);
	}
	//Delete mappping
	@DeleteMapping("/{id}")
	public void deleteProduct(@PathVariable Long id) {
		productService.deleteProduct(id);
	}
	
	
	
	

}
