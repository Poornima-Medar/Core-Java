package com.hibernate;

import java.util.Arrays;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "address_info")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "pin_code")
	private int pinCode;

	@Column(length = 25)
	private String country;

	@Column(length = 25)
	private String city;

	// @Transient -> used to do not store in to the database table
	@Column(length = 25)
	private String Street;

	@Lob
	private byte[] image;

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		Street = street;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public Address(int pinCode, String country, String city, String street, byte[] image) {
		super();
		this.pinCode = pinCode;
		this.country = country;
		this.city = city;
		Street = street;
		this.image = image;
	}

	public Address() {
		super();

	}

	@Override
	public String toString() {
		return "Address [pinCode=" + pinCode + ", country=" + country + ", city=" + city + ", Street=" + Street
				+ ", image=" + Arrays.toString(image) + "]";
	}

}
