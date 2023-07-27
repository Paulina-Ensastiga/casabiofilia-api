package com.casabiofilia.casabiofilia.Entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
@Table(name = "user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_user", unique = true, nullable = false)
	private Long id_user;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private String last_name;
	@Column(nullable = false)
	private String email;
	@Column(nullable = false)
	private String telephone;
	@Column(nullable = false)
	private String password;

		public User() {
			
		}


		@OneToOne
		@JoinColumn(name="address_id_address", nullable=false)
		private Address address;

		@OneToMany(mappedBy="user")
		@JsonManagedReference(value="user-orden")
	//	@JoinColumn(name="user_id_user", nullable=false)
		private List<Orden> orden;

		public Long getId_user() {
			return id_user;
		}

		public void setId_user(Long id_user) {
			this.id_user = id_user;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getLast_name() {
			return last_name;
		}

		public void setLast_name(String last_name) {
			this.last_name = last_name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getTelephone() {
			return telephone;
		}

		public void setTelephone(String telephone) {
			this.telephone = telephone;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public Address getAddress() {
			return address;
		}

		public void setAddress(Address address) {
			this.address = address;
		}

		public List<Orden> getOrden() {
			return orden;
		}

		public void setOrden(List<Orden> orden) {
			this.orden = orden;
		}

		
		
		
}
