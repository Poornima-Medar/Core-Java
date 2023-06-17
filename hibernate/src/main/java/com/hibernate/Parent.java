package com.hibernate;

import jakarta.persistence.Embeddable;

@Embeddable
public class Parent {

	private String fatherName;
	private String motherName;

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public Parent(String fatherName, String motherName) {
		super();
		this.fatherName = fatherName;
		this.motherName = motherName;
	}

	public Parent() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Parent [fatherName=" + fatherName + ", motherName=" + motherName + "]";
	}

}
