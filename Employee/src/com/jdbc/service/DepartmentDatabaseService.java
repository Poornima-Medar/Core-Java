package com.jdbc.service;

import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jdbc.model.Department;
import com.jdbc.util.DatabaseUtil;
import com.jdbc.util.QueryUtil;

public class DepartmentDatabaseService {
	DatabaseUtil databaseUtil = new DatabaseUtil();
	Scanner scanner = new Scanner(System.in);

	public void insertDepartment(Department department) throws SQLException {
		try (Connection connection = databaseUtil.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(QueryUtil.insertDepartmentQuery())) {
			preparedStatement.setInt(1, department.getDept_no());
			preparedStatement.setString(2, department.getDept_name());
			preparedStatement.setString(3, department.getDept_location());

			int rows = preparedStatement.executeUpdate();

			if (rows > 0) {
				System.out.println("Record inserted into department table successfully");
			} else {
				System.out.println("insertion failed");
			}

		}
	}// End of insertDepartment

	public void getDepartmentData() throws SQLException {
		try (Connection connection = databaseUtil.getConnection();
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery(QueryUtil.selectAllDepartment())) {
			while (resultSet.next()) {
				printDepartment(new Department(resultSet.getInt("dept_no"), resultSet.getString("dept_name"),
						resultSet.getString("dept_location")));
			}

		}
	}

	private void printDepartment(Department department) {
		System.out.println("Department no: " + department.getDept_no());
		System.out.println("Department Name: " + department.getDept_name());
		System.out.println("Department Location: " + department.getDept_location());
		System.out.println("-----------------------------------------------");
	}

	public boolean getDepartmentByDeptNo(int dept_no) throws SQLException {
		boolean flag = false;
		try (Connection connection = databaseUtil.getConnection();
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery(QueryUtil.selectDepartmentByDeptNo(dept_no));) {

			if (resultSet.next()) {
				flag = true;
				printDepartment(new Department(resultSet.getInt("dept_no"), resultSet.getString("dept_name"),
						resultSet.getString("dept_location")));
			} else {
				System.out.println("department no is not found, please check dept no");
			}

		}
		return flag;
	}

	public void updateDepartmentData() throws SQLException {
		System.out.println("Enter the roll no");
		int dept_id = Integer.parseInt(scanner.nextLine());
		boolean isFound = getDepartmentByDeptNo(dept_id);

		if (isFound) {
			System.out.println("yes");
			System.out.println("Enter department no , name and location ");
			Department department = new Department(dept_id, scanner.nextLine(), scanner.nextLine());
			Connection connection = databaseUtil.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(QueryUtil.updateDepartmentQuery(dept_id));
			preparedStatement.setString(1, department.getDept_name());
			preparedStatement.setString(2, department.getDept_location());

			int rows = preparedStatement.executeUpdate();
			if (rows > 0) {
				System.out.println("Updated successfully");
			} else {
				System.out.println("not updated");
			}
		} 
	}

}
