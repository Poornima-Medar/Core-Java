package com.springcore.autowiring;

public class Employee {
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("Setter called");
		this.address = address;
	}

	public Employee(Address address) {
		super();
		this.address = address;
		System.out.println("Constructor called");
	}
	

	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	
}
