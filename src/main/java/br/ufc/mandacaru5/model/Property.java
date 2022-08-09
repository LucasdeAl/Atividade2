package br.ufc.mandacaru5.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Property {

	@Id
	@GeneratedValue
	private int id;
	private String title;
	private String address;
	private Double terrainArea;
	private Double constructedArea;
	private int rooms;
	private int bathroons;
	private int garageVacancies;
	private double price;
	private String status;

	@ManyToOne
	@JoinColumn(name = "user_id")
	@JsonIgnore
	private User user;
	

	public Property() {
		super();
	}

	public Property(int id, String title, String address, Double terrainArea, Double constructedArea, int rooms,
			int bathroons, int garageVacancies, double price, String status, User user) {
		super();
		this.id = id;
		this.title = title;
		this.address = address;
		this.terrainArea = terrainArea;
		this.constructedArea = constructedArea;
		this.rooms = rooms;
		this.bathroons = bathroons;
		this.garageVacancies = garageVacancies;
		this.price = price;
		this.status = status;
		this.user = user;
	}

	@Override
	public String toString() {
		return "Imovel [id=" + id + ", title=" + title + ", address=" + address + ", terrainArea=" + terrainArea
				+ ", constructedArea=" + constructedArea + ", rooms=" + rooms + ", bathroons=" + bathroons
				+ ", garageVacancies=" + garageVacancies + ", price=" + price + ", status=" + status + ", user=" + user
				+ "]";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Double getTerrainArea() {
		return terrainArea;
	}

	public void setTerrainArea(Double terrainArea) {
		this.terrainArea = terrainArea;
	}

	public Double getConstructedArea() {
		return constructedArea;
	}

	public void setConstructedArea(Double constructedArea) {
		this.constructedArea = constructedArea;
	}

	public int getRooms() {
		return rooms;
	}

	public void setRooms(int rooms) {
		this.rooms = rooms;
	}

	public int getBathroons() {
		return bathroons;
	}

	public void setBathroons(int bathroons) {
		this.bathroons = bathroons;
	}

	public int getGarageVacancies() {
		return garageVacancies;
	}

	public void setGarageVacancies(int garageVacancies) {
		this.garageVacancies = garageVacancies;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}