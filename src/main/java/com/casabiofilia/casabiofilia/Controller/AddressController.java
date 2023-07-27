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

import com.casabiofilia.casabiofilia.Entity.Address;
import com.casabiofilia.casabiofilia.Service.AddressService;

@RequestMapping(path="/casabiofilia/address")
@RestController

public class AddressController {
	private final AddressService addressService; 

	@Autowired
	public AddressController(AddressService addressService) {
		this.addressService = addressService;
	}
	
	//Get all
	@GetMapping
	public List<Address> getAddress(){
		return addressService.getAllAddress();
		
	}
	//Get individual
	@GetMapping("/{id}")
	public Address getAddressById(@PathVariable Long id) {
		return addressService.getAddressById(id);
	}
	
	@PostMapping
	public Address createAddress(@RequestBody Address address) {
		return addressService.createAddress(address);
	}
	
	@PutMapping
	public Address updateAddress(@RequestBody Address address) {
		return addressService.updateAddress(address);
	}
	//Delete mappping
	@DeleteMapping("/{id}")
	public void deleteAddress(@PathVariable Long id) {
		addressService.deleteAddress(id);
	}
}