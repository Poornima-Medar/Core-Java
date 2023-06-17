package com.student.manage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseConnection {
	
	private String dbname = "postgres";
	private String user = "postgres";
	private String password = "test123";
	
	private void connect() {
		try(Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/"+dbname,user,password)) {
			if(connection != null) {
				System.out.println("Connection made Successfully");
			}else {
				System.out.println("Failed to connect database... Re-try again....");
			}
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT VERSION()");
			if(resultSet.next()) {
				System.out.println(resultSet.getString(1));
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		DatabaseConnection sqlConnection = new DatabaseConnection();
		sqlConnection.connect();
	}

}

