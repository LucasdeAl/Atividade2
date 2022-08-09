package br.ufc.mandacaru5.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String email;
	private String password;
	private String cpf;//Person registration in Brazil
	private String phoneNumber;
	private String Address;
	
	@OneToMany(mappedBy = "property")
	private List<Property> properties;
	

	public User() {
		super();
	}

	public User(int id, String name, String email, String password, String cpf, String phoneNumber, String address,
			List<Property> properties) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.cpf = cpf;
		this.phoneNumber = phoneNumber;
		Address = address;
		this.properties = properties;
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public List<Property> getProperties() {
		return properties;
	}

	
    public void setProperties(List<Property> properties) {
		this.properties = properties;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", cpf=" + cpf
				+ ", phoneNumber=" + phoneNumber + ", Address=" + Address + ", properties=" + properties + "]";
	}



}
