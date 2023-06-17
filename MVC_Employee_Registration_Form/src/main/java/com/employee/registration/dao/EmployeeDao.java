package com.employee.registration.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.employee.registration.model.Employee;

public class EmployeeDao {
	public int registerEmployee(Employee employee) throws ClassNotFoundException {

		String dbName = "Employee1";
		String user = "postgres";
		String password = "test123";
		
		String sql = "INSERT INTO employee" + "(firstname,lastname,username,password,address,contact) VALUES"
				+ "(?,?,?,?,?,?);";

		int result = 0;

		Class.forName("org.postgresql.Driver");
		try (Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + dbName, user,
				password)) {
			PreparedStatement preparedStatement = conn.prepareStatement(sql); 
			preparedStatement.setString(1, employee.getFirstName());
			preparedStatement.setString(2, employee.getLastName());
			preparedStatement.setString(3, employee.getUserName());
			preparedStatement.setString(4, employee.getPassword());
			preparedStatement.setString(5, employee.getAddress());
			preparedStatement.setString(6, employee.getContact());
			
			System.out.println(preparedStatement);
			
			result = preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
      return result;
	}

}
