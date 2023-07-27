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

import com.casabiofilia.casabiofilia.Entity.Orden;
import com.casabiofilia.casabiofilia.Entity.OrdenRequest;
import com.casabiofilia.casabiofilia.Service.OrdenService;
@RestController
@RequestMapping(path="/casabiofilia/orden")



public class OrdenController {
	
	private final OrdenService ordenService; 

	@Autowired
	public OrdenController(OrdenService ordenService) {
		this.ordenService = ordenService;
	}
	
	
	//OrdenRequest es un DTO
	//@PostMapping
	public Orden createOrden(@RequestBody OrdenRequest ordenRequest) {
		return ordenService.createOrden(ordenRequest);
	}
	/*
	
	@GetMapping
	public List<Orden> getOrden(){
		return ordenService.getAllOrden();
		
	}

	//Get individual
	@GetMapping("/{id}")
	public Orden getOrdenById(@PathVariable Long id) {
		return ordenService.getOrdenById(id);
	}
	
	@PostMapping
	public Orden createOrden(@RequestBody Orden orden) {
		return ordenService.createOrden(orden);
	}
	
	@PutMapping
	public Orden updateOrden(@RequestBody Orden orden) {
		return ordenService.updateOrden(orden);
	}
	//Delete mappping
	@DeleteMapping("/{id}")
	public void deleteOrden(@PathVariable Long id) {
		ordenService.deleteOrden(id);
	}*/
}
