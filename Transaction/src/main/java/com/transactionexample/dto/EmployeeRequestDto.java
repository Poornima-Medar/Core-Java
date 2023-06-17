package com.transactionexample.dto;


public class EmployeeRequestDto {
	private String employeeName;
	private String employeeAddress;
	private String departmentName;

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public EmployeeRequestDto(String employeeName, String employeeAddress, String departmentName) {
		super();
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.departmentName = departmentName;
	}

	public EmployeeRequestDto() {
		super();
	}

}
