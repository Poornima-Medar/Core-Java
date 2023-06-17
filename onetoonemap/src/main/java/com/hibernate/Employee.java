package com.hibernate;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;

@Entity
public class Employee {

	@Id
	@Column(name = "employee_id")
	private int id;

	@Column(name = "employee_firstName", length = 25)
	private String firstName;

	@Column(name = "employee_lastName", length = 25)
	private String lastName;

	@Column(name = "employee_address", length = 50)
	private String address;

	@Column(name = "employee_gender", length = 10)
	private String gender;

	@Column(name = "employee_salary")
	private Long salary;

	@OneToMany(mappedBy = "employee")
	private List<Department> departments;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

	public List<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}

	public Employee(int id, String firstName, String lastName, String address, String gender, Long salary,
			List<Department> departments) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.gender = gender;
		this.salary = salary;
		this.departments = departments;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
				+ ", gender=" + gender + ", salary=" + salary + ", departments=" + departments + "]";
	}

}
