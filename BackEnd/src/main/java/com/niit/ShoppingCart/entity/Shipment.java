package com.niit.ShoppingCart.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "shipment")
public class Shipment implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String shippingAddressId;

	private String address;
	private String city;
	private String state;
	private String zipcode;
	private String country;

	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "userid")
	private User user;

	public String getAddressId() {
		return shippingAddressId;
	}

	public void setAddressId(String shippingAddressId) {
		this.shippingAddressId = shippingAddressId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
