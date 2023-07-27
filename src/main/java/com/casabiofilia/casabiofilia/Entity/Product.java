package com.casabiofilia.casabiofilia.Entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
@Table(name="product")
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_product", unique=true, nullable=false)
		private Long id_product;
	@Column(name="name", nullable = false)
		private String name;
	@Column(name="description", nullable = false)
		private String description;
	@Column(name="price", nullable = false)
		private double price;
	@Column(name="in_stock", nullable = false)
		private int in_stock;
		
		public Product() {
			
		}
		
		@ManyToOne
		@JoinColumn(name="category_id_category", nullable=false)
		private Category category; 
		
		@OneToMany(mappedBy="product")
		@JsonManagedReference(value="product-orden")
		//@JoinColumn(name="product_id_product", nullable=false)
		private List<Orden> orden;

		public Long getId_product() {
			return id_product;
		}

		public void setId_product(Long id_product) {
			this.id_product = id_product;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public int getIn_stock() {
			return in_stock;
		}

		public void setIn_stock(int in_stock) {
			this.in_stock = in_stock;
		}

		public Category getCategory() {
			return category;
		}

		public void setCategory(Category category) {
			this.category = category;
		}

		public List<Orden> getOrden() {
			return orden;
		}

		public void setOrden(List<Orden> orden) {
			this.orden = orden;
		}

} 
