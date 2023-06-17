package com.hibernate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory sessionFactory = cfg.buildSessionFactory();

		Employee employee = new Employee();
		employee.setId(1);
		employee.setFirstName("Jhon");
		employee.setLastName("Smith");
		employee.setAddress("Pune");
		employee.setGender("Male");
		employee.setSalary((long) 50000);

		Department department = new Department();
		department.setDepartmentNumber(101);
		department.setDepartmentName("It");
		department.setDepartmentLocation("Pune");
		department.setEmployee(employee);

		Department department2 = new Department();
		department2.setDepartmentNumber(102);
		department2.setDepartmentName("Account");
		department2.setDepartmentLocation("Banglore");
		department2.setEmployee(employee);

		Department department3 = new Department();
		department3.setDepartmentNumber(103);
		department3.setDepartmentName("Hr");
		department3.setDepartmentLocation("Pune");
		department3.setEmployee(employee);

		List<Department> d = new ArrayList<Department>();
		d.add(department);
		d.add(department2);
		d.add(department3);

		employee.setDepartments(d);

		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();
		Employee e = session.get(Employee.class, 1);

		System.out.println(e.getFirstName() + " " + e.getLastName());

		System.out.println("_________________");
		
		session.delete(e);

		Employee e1 = (Employee) session.get(Employee.class, 1);

		System.out.println(e1.getFirstName() + " " + e.getLastName());

		t.commit();
		session.close();
//		sessionFactory.close();

	}
}

//Employee employee2 = new Employee();
//employee2.setId(2);
//employee2.setFirstName("Megha");
//employee2.setLastName("m");
//employee2.setAddress("Pune");
//employee2.setGender("Female");
//employee2.setSalary((long) 75000);
//employee2.setDepartmentNumber(department3);
//
//Employee employee3 = new Employee();
//employee3.setId(3);
//employee3.setFirstName("Jaya");
//employee3.setLastName("M");
//employee3.setAddress("Banglore");
//employee3.setGender("Female");
//employee3.setSalary((long) 65000);
//employee3.setDepartmentNumber(department2);

//department.setEmployee(employee);
//department.setEmployee(employee);
//department.setEmployee(employee);

//for (Department d1 : e.getDepartments()) {
//System.out.println(d1);
//}

//session.persist(employee);
////session.persist(employee2);
////////session.persist(employee3);
//session.persist(department);
//session.persist(department2);
//session.persist(department3);
