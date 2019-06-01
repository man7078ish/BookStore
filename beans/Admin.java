package com.capgemini.bookStore.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "admin")
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String adminId;
	private String email;
	private String name;
	private String password;

	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", email=" + email + ", name=" + name + ", password=" + password + "]";
	}

	public Admin(String adminId, String email, String name, String password) {
		super();
		this.adminId = adminId;
		this.email = email;
		this.name = name;
		this.password = password;
	}

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

}
