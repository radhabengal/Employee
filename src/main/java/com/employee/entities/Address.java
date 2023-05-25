package com.employee.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Address")
public class Address {

	@Id
	@Column(name = "address_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Address_ID;

	@Column(name = "street1")
	private String street1;
	
	@Column(name = "street2")
	private String street2;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "state")
	private String state;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(int address_ID, String street1, String street2, String city, String state) {
		super();
		Address_ID = address_ID;
		this.street1 = street1;
		this.street2 = street2;
		this.city = city;
		this.state = state;
	}

	public int getAddress_ID() {
		return Address_ID;
	}

	public void setAddress_ID(int address_ID) {
		Address_ID = address_ID;
	}

	public String getStreet1() {
		return street1;
	}

	public void setStreet1(String street1) {
		this.street1 = street1;
	}

	public String getStreet2() {
		return street2;
	}

	public void setStreet2(String street2) {
		this.street2 = street2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [Address_ID=" + Address_ID + ", street1=" + street1 + ", street2=" + street2 + ", city=" + city
				+ ", state=" + state + "]";
	}

}
