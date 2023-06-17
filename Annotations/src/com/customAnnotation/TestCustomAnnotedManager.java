package com.customAnnotation;

import java.lang.annotation.Annotation;

public class TestCustomAnnotedManager {

	public static void main(String[] args) {
		CustomAnnotedManager manager = new CustomAnnotedManager(1, "PQR");

		Annotation customAnnotation = manager.getClass().getAnnotation(Company.class);
		Company company = (Company) customAnnotation;
		
	
		if(manager.getClass().isAnnotationPresent(Company.class)) {
			System.out.println("Comany Name : " + company.companyName());
			System.out.println("Company city : " + company.city());
			manager.getEmployeeDetails();
		}else {
			System.out.println("Not Annoted");
		}
		
	}

}
