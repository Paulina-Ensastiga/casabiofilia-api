package com.casabiofilia.casabiofilia.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.casabiofilia.casabiofilia.Entity.Product;

import com.casabiofilia.casabiofilia.Repository.ProductRepository;


@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	//Get
	public List<Product> getAllProduct(){
		return productRepository.findAll();
	}
	//Get by Id
	public Product getProductById(Long id) {
		return productRepository.findById(id).orElse(null);
	}
	//Post
	public Product createProduct(Product product) {
		return productRepository.save(product);
	}
	
	//Put
	public Product updateProduct(Product product) {
		return productRepository.save(product);
	}
	//Delete
	public void deleteProduct(Long id) {
		productRepository.deleteById(id);
	}


}
