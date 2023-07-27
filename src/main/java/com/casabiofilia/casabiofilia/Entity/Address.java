package com.casabiofilia.casabiofilia.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name="address")
public class Address {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_address", unique=true, nullable=false)
	private Long id_address;
	@Column(nullable = false)
	private	String street_number;
	@Column(nullable = false)
	private	int zip_code;
	@Column(nullable = false)
	private	String city;
	@Column(nullable = false)
	private String state;
	
	public Address() {}

	public Long getId_address() {
		return id_address;
	}

	public void setId_address(Long id_address) {
		this.id_address = id_address;
	}

	public String getStreet_number() {
		return street_number;
	}

	public void setStreet_number(String street_number) {
		this.street_number = street_number;
	}

	public int getZip_code() {
		return zip_code;
	}

	public void setZip_code(int zip_code) {
		this.zip_code = zip_code;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}




	
}
