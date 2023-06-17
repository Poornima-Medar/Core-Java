package com.springcore.autowiring.annotation;

public class Information {
	private String name;
	private String rollNumber;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}

	public Information(String name, String rollNumber) {
		super();
		this.name = name;
		this.rollNumber = rollNumber;
	}

	public Information() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Information [name=" + name + ", rollNumber=" + rollNumber + "]";
	}

}
