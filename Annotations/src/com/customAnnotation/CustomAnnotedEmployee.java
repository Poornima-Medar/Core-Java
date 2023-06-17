package com.customAnnotation;

@Company
public class CustomAnnotedEmployee {
	private int employeeID;
	private String firstName;
	
	CustomAnnotedEmployee(int employeeID,String firstName) {
		this.employeeID = employeeID;
		this.firstName = firstName;
	}
	
	public void getEmployeeDetails() {
		System.out.println("Employee ID : "+employeeID);
		System.out.println("Employee Name : "+firstName);
	}
	
	


}
