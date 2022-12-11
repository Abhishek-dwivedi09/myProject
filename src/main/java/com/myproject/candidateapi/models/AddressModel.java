package com.myproject.candidateapi.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="address")
public class AddressModel {

	@Id
	@GeneratedValue 
	private int id;
	private String city;
	
	private String houseNo;
	
	private String galiNo;

	public AddressModel(int id, String city, String houseNo, String galiNo) {
		super();
		this.id = id;
		this.city = city;
		this.houseNo = houseNo;
		this.galiNo = galiNo;
	}

	public AddressModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public String getGaliNo() {
		return galiNo;
	}

	public void setGaliNo(String galiNo) {
		this.galiNo = galiNo;
	}
}
