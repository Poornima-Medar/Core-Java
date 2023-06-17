package com.jdbc.main;

import java.util.Scanner;

import com.jdbc.model.Department;
import com.jdbc.service.DatabaseService;
import com.jdbc.service.DepartmentDatabaseService;

public class MainClass {
	public static void main(String[] args) {

		DatabaseService databaseService = new DatabaseService();
		DepartmentDatabaseService departmentDatabaseService = new DepartmentDatabaseService();

		try (Scanner scanner = new Scanner(System.in);) {
			boolean flag = true;
			while (flag) {
				System.out.println("Enter choice");
				System.out.println("1. Insert data into table employee");
				System.out.println("2. Select all employee data");
				System.out.println("3. Select an Employee by an Id");
				System.out.println("4. Delete Employee");
				System.out.println("5. Update Employee");
				System.out.println("6. Insert data into table department");
				System.out.println("7. slect all department data");
				System.out.println("8. Update the department table");
				System.out.println("9. Exit");
				System.out.println("10. Batch Processing");
				System.out.println("11. callable method");

				int choice = Integer.parseInt(scanner.nextLine());

				switch (choice) {
				case 1:
					databaseService.insertEmployee();
					break;
				case 2:
					databaseService.getAllEmployees();
					break;
				case 3:
					System.out.println("Enter id of an emloyee");
					databaseService.getEmployeeById(Integer.parseInt(scanner.nextLine()));
					break;
				case 4:
					System.out.println("Enter id of an emloyee");
					databaseService.deleteEmployeeById(Integer.parseInt(scanner.nextLine()));
					break;
				case 5:
					databaseService.updateEmployee();
					break;
				case 6:
					System.out.println("Enter department no,department name and department location ");
					departmentDatabaseService.insertDepartment(new Department(Integer.parseInt(scanner.nextLine()),
							scanner.nextLine(), scanner.nextLine()));
					break;
				case 7:
					departmentDatabaseService.getDepartmentData();
					break;
				case 8:
					departmentDatabaseService.updateDepartmentData();
					break;
				case 9:
					System.out.println("Thank You...");
					flag = false;
					break;
				case 10:
					databaseService.batchProcessing();
					break;
				case 11:
					databaseService.storedProcedure();
					break;
				default:
					System.out.println("Incorrect Choice");
					break;
				}
			}
		} catch (Exception e) {
			throw new RuntimeException("Something Went wrong" + e);
		}

	}

}

//To create table
// Connection conn = databaseUtil.getConnection();
// databaseService.createTable(conn,"department");

//to create connection
//		Connection con;
//		try {
//			con = databaseUtil.getConnection();
//			if (con != null) {
//				System.out.println("done");
//			} else {
//				System.out.println("no");
//			}
//
//		} catch (SQLException e1) {
//			e1.printStackTrace();
//		}

//import java.sql.Connection;
//import java.sql.SQLException;
//import com.jdbc.model.Employee;

//DatabaseUtil databaseUtil = new DatabaseUtil();
//import com.jdbc.util.DatabaseUtil;