package com.casabiofilia.casabiofilia.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="category")
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_category", unique = true, nullable = false)
private Long id_category;
	@Column(nullable=false)
private String name;
	
public Category() {}


public Long getId_category() {
	return id_category;
}
public void setId_category(Long id_category) {
	this.id_category = id_category;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}


}
