package com.casabiofilia.casabiofilia.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "orden")
public class Orden {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "no_orden", unique = true, nullable = false)
	private Long no_orden;
	
	@Column(name="cant", nullable = false)
	private int cant;
	
	@Column(name="date_orden",nullable = false)
	private String date_orden;
	
	public Orden() {
		
	}
	
	@ManyToOne(cascade= CascadeType.ALL)
	@JoinColumn(name="product_id_product", nullable=false)
	@JsonBackReference(value="product-orden")//Anotación para controlar peticiones a esta entidad
	private Product product;
	
	@ManyToOne(cascade= CascadeType.ALL)
	@JoinColumn(name="user_id_user", nullable=false)
	@JsonBackReference(value="user-orden")
	private User user;

	public Long getNo_orden() {
		return no_orden;
	}

	public void setNo_orden(Long no_orden) {
		this.no_orden = no_orden;
	}

	public int getCant() {
		return cant;
	}

	public void setCant(int cant) {
		this.cant = cant;
	}

	public String getDate_orden() {
		return date_orden;
	}

	public void setDate_orden(String date_orden) {
		this.date_orden = date_orden;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}
