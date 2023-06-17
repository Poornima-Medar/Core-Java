package com.customAnnotation;

public class TestCustomAnnotedEmployee {

	public static void main(String[] args) {
		CustomAnnotedEmployee employee = new CustomAnnotedEmployee(101, "XYZ");
		
		Company annotation = (Company) employee.getClass().getAnnotation(Company.class);
		System.out.println("Company Name : "+annotation.companyName());
		System.out.println("City : "+annotation.city());
		employee.getEmployeeDetails();
		

	}

}
