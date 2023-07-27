package com.casabiofilia.casabiofilia.Service;

import java.util.List;

import javax.persistence.criteria.Order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.casabiofilia.casabiofilia.Entity.Orden;
import com.casabiofilia.casabiofilia.Entity.OrdenRequest;
import com.casabiofilia.casabiofilia.Entity.Product;
import com.casabiofilia.casabiofilia.Entity.User;
import com.casabiofilia.casabiofilia.Repository.OrdenRepository;
import com.casabiofilia.casabiofilia.Repository.ProductRepository;
import com.casabiofilia.casabiofilia.Repository.UserRepository;

@Service
public class OrdenService {
	private final OrdenRepository ordenRepository;
	private final ProductRepository productRepository;
	private final UserRepository userRepository;
	@Autowired
	public OrdenService(OrdenRepository ordenRepository, ProductRepository productRepository,
			UserRepository userRepository) {
		this.ordenRepository = ordenRepository;
		this.productRepository = productRepository;
		this.userRepository = userRepository;
	}
	//POST METHOD
	public Orden createOrden(OrdenRequest ordenRequest) {
		Long product_id_product = ordenRequest.getProduct_id_product();
		Long user_id_user = ordenRequest.getUser_id_user();
		int cant = ordenRequest.getCant();
		String date_orden = ordenRequest.getDate_orden();
		
		Product persistentProduct = productRepository.findById(product_id_product).orElse(null);
		User persistentUser = userRepository.findById(user_id_user).orElse(null);
	
		//Construct and populate a new UserHasBook instance
		Orden orden = new Orden();
		orden.setUser(persistentUser);
		orden.setProduct(persistentProduct);
		orden.setCant(cant);
		orden.setNo_orden(user_id_user);
		
		//save it 
		return ordenRepository.save(orden);
}
	
	/*
	//Get
	public List<Orden> getAllOrden(){
		return ordenRepository.findAll();
	}

	//Get by Id
	public Orden getOrdenById(Long id) {
		return ordenRepository.findById(id).orElse(null);
	}
	//Post
	public Orden createOrden(Orden orden) {
		return ordenRepository.save(orden);
	}
	
	//Put
	public Orden updateOrden(Orden orden) {
		return ordenRepository.save(orden);
	}
	//Delete
	public void deleteOrden(Long id) {
		ordenRepository.deleteById(id);
	}
	*/
}
