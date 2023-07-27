package com.casabiofilia.casabiofilia.Entity;
//DTO
public class OrdenRequest {
	private Long product_id_product;
	private Long user_id_user;
	private int cant;
	private String date_orden;
	public Long getProduct_id_product() {
		return product_id_product;
	}
	public void setProduct_id_product(Long product_id_product) {
		this.product_id_product = product_id_product;
	}
	public Long getUser_id_user() {
		return user_id_user;
	}
	public void setUser_id_user(Long user_id_user) {
		this.user_id_user = user_id_user;
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
}

