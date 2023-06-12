package com.app.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User extends BaseEntity {
	@Column(length=15)
	private String firstname;
	
	@Column(length=15)
	private String lastname;
	
	@Column(length=30,unique=true)
	private String email;
	
	@Column(length=15,nullable=false)
	private String password;
	
	@Column(length=10)
	private String phone;
	
	@OneToMany(mappedBy ="user",cascade= CascadeType.REMOVE,orphanRemoval = true)
	private List<Disease> diseases=new ArrayList<>(); 
	
	public User() {}

	public User(String firstname, String lastname, String email, String password, String phone) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
		this.phone = phone;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "User [firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + ", password=" + password
				+ ", phone=" + phone + "]";
	};
	
	

}
