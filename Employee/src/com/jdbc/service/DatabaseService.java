package com.jdbc.service;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;

import com.jdbc.model.Employee;
import com.jdbc.util.DatabaseUtil;
import com.jdbc.util.QueryUtil;

public class DatabaseService {
	DatabaseUtil databaseUtil = new DatabaseUtil();
	Scanner scanner = new Scanner(System.in);

	public void createTable(Connection conn, String table_name) {
		Statement statement;
		try {
			//String q = "create table "+table_name
			//+ "(dept_no int not null, dept_name varchar(25) not null, dept_location varchar(25));";

			// String q="ALTER TABLE employee_information ADD PRIMARY KEY(employee_id)";

			String q = "alter table employee_information add constraint fk_employee_information_department FOREIGN KEY (dept_no) REFERENCES department (dept_no)";
			// ALTER TABLE orders
			// ADD CONSTRAINT fk_orders_customers FOREIGN KEY (customer_id) REFERENCES
			// customers (id);
			statement = conn.createStatement();
			statement.executeUpdate(q);
			System.out.println("Table is created");
		} catch (Exception e) {
			throw new RuntimeException("Something went wrong " + e);
		}
	}// End of createTable

	public void insertEmployee() throws SQLException {
		System.out.println("Enter Name, Address, Salary,Dept_no");
		Employee employee = new Employee(scanner.nextLine(), scanner.nextLine(),
				Double.parseDouble(scanner.nextLine()), Integer.parseInt(scanner.nextLine()));
		try (Connection connection = databaseUtil.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(QueryUtil.insertEmployeeQuery())) {
			preparedStatement.setString(1, employee.getEmployeeName());
			preparedStatement.setString(2, employee.getEmployeeAddress());
			preparedStatement.setDouble(3, employee.getEmployeeSalary());
			preparedStatement.setInt(4, employee.getDept_no());

			int rows = preparedStatement.executeUpdate();

			if (rows > 0) {
				System.out.println("Record inserted successfully");
			} else {
				System.out.println("insertion failed");
			}

		}
	}// End of insertEmployee

	public void getAllEmployees() throws SQLException {
		try (Connection connection = databaseUtil.getConnection();
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery(QueryUtil.selectAllEmployeeQuery())) {

			while (resultSet.next()) {
				printEmployee(new Employee(resultSet.getInt("employee_id"), resultSet.getString("employee_name"),
						resultSet.getString("employee_address"), resultSet.getDouble("employee_salary"),
						resultSet.getInt("dept_no")));
			}
		}
	}// End of getAllEmployee

	private void printEmployee(Employee employee) {
		System.out.println("Employee id: " + employee.getEmployeeId());
		System.out.println("Employee name: " + employee.getEmployeeName());
		System.out.println("Employee adress: " + employee.getEmployeeAddress());
		System.out.println("Employee salary: " + employee.getEmployeeSalary());
		System.out.println("Employee dept_no: " + employee.getDept_no());

		System.out.println("-----------------------------------------------------------");
	}

	public boolean getEmployeeById(int id) throws SQLException {
		boolean isFound = false;
		try (Connection connection = databaseUtil.getConnection();
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery(QueryUtil.selectEmployeeById(id))) {

			if (resultSet.next()) {
				isFound = true;
				printEmployee(new Employee(resultSet.getInt("employee_id"), resultSet.getString("employee_name"),
						resultSet.getString("employee_address"), resultSet.getDouble("employee_salary"),
						resultSet.getInt("dept_no")));
			} else {
				System.out.println("Record not found for id " + id);
			}

		}
		return isFound;
	}// End of getEmployeeById

	public void deleteEmployeeById(int employeeId) throws SQLException {
		try (Connection connection = databaseUtil.getConnection();
				Statement statement = connection.createStatement();) {
			int rows = statement.executeUpdate(QueryUtil.deleteEmployeeById(employeeId));

			if (rows > 0) {
				System.out.println("Record deleted successfully");
			} else {
				System.out.println("employee_Id does not exist");
			}
		}

	}// End of deleteEmployeeById

	public void updateEmployee() throws SQLException {
		System.out.println("Enter id of an emloyee");
		int updateId = Integer.parseInt(scanner.nextLine());
		boolean isfound = getEmployeeById(updateId);
		if (isfound) {
			System.out.println("Enter Name, Address, Salary,dept_no");
			Employee employee = new Employee(updateId, scanner.nextLine(), scanner.nextLine(),
					Double.parseDouble(scanner.nextLine()), Integer.parseInt(scanner.nextLine()));
			Connection connection = databaseUtil.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(QueryUtil.updateEmployeeQuery(employee.getEmployeeId()));
			preparedStatement.setString(1, employee.getEmployeeName());
			preparedStatement.setString(2, employee.getEmployeeAddress());
			preparedStatement.setDouble(3, employee.getEmployeeSalary());
			preparedStatement.setInt(4, employee.getDept_no());

			int rows = preparedStatement.executeUpdate();

			if (rows > 0) {
				System.out.println("Record updated successfully");
			} else {
				System.out.println("updation failed");
			}

		}

	}// End of updateEmployee

	public void delete_table(Connection conn, String table_name) {
		Statement statement;
		try {
			String query = String.format("drop table  %s ", table_name);
			statement = conn.createStatement();
			statement.executeUpdate(query);
			System.out.println("table deleted");
		} catch (Exception e) {
			System.out.println(e);
		}
	}// End of delete_table
	
	
	public void transaction() throws SQLException {
		Connection connection = databaseUtil.getConnection();
		connection.setAutoCommit(false);
		
		String sql1 = "insert into employee_information(employee_name, employee_address, employee_salary, dept_no) values('xyz','pune','12314','1')";
		String sql2 = "inser into employee_information(employee_name, employee_address, employee_salary, dept_no) values('pqr','pune','67686','1')";
		
		PreparedStatement  preparedStatement =connection.prepareStatement(sql1);
		int row1 = preparedStatement.executeUpdate();
		
		preparedStatement =connection.prepareStatement(sql2);
		int row2 = preparedStatement.executeUpdate();
		
		if(row1>0 && row2>0) {
			connection.commit();
		}else {
			connection.rollback();
		}
	}//End of transaction
	
	public void batchProcessing() throws SQLException {
		Connection connection = databaseUtil.getConnection();
		connection.setAutoCommit(false);
		String sql1 = "inser into employee_information(employee_name, employee_address, employee_salary, dept_no) values('xyz','pune','12314','1')";
		String sql2 = "insert into employee_information(employee_name, employee_address, employee_salary, dept_no) values('pqr','pune','67686','1')";
		String sql3 = "insert into employee_information(employee_name, employee_address, employee_salary, dept_no) values('abc','pune','12384','1')";
		
		Statement statement = connection.createStatement();
		statement.addBatch(sql1);
		statement.addBatch(sql2);
		statement.addBatch(sql3);
		
		int array[] = statement.executeBatch();
		
		for(int i : array) {
			if(i>0) {
				continue;
			}else {
				connection.rollback();
			}
		}
		
		connection.commit();
		
	}
	
	public void storedProcedure() throws SQLException {
		Connection connection = databaseUtil.getConnection();
		CallableStatement callableStatement =   connection.prepareCall("call addProc(?,?,?) ");
		callableStatement.setInt(1, 2000);
		callableStatement.setInt(2, 2000);
		callableStatement.registerOutParameter(3, Types.INTEGER);
		callableStatement.execute();
		System.out.println(callableStatement.getInt(3));
		
	}

}

