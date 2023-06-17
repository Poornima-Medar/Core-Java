package com.jpa.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Person {
	@Id
	private Integer id;
	private String firstName;
	private String secondName;
	private String lastName;
	private String address;
	private String phoneNumber;
	private LocalDate birthDate;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(Integer id, String firstName, String secondName, String lastName, String address, String phoneNumber,
			LocalDate birthDate) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.secondName = secondName;
		this.lastName = lastName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.birthDate = birthDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", secondName=" + secondName + ", lastName=" + lastName
				+ ", address=" + address + ", phoneNumber=" + phoneNumber + ", birthDate=" + birthDate + "]";
	}
}
