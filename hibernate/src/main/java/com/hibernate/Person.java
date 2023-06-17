package com.hibernate;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Person {

	@Id
	private Long id;
	private String firstName;
	private String lastName;
	private int age;
	@Temporal(value = TemporalType.DATE)
	private Date date;
	
	private Parent parents;

	public Long getId() {
		return id;
	}

	public void setId(long i) {
		this.id = i;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Parent getParents() {
		return parents;
	}

	public void setParents(Parent parents) {
		this.parents = parents;
	}

	public Person(Long id, String firstName, String lastName, int age, Date date, Parent parents) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.date = date;
		this.parents = parents;
	}

	public Person() {
		super();
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", date="
				+ date + ", parents=" + parents + "]";
	}

}
