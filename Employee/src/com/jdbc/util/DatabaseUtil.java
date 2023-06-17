package com.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtil {
	private static final String DRIVER_PATH = "org.postgresql.Driver";
	private static final String DATABASE_URL = "jdbc:postgresql://localhost:5432/employee";
	private static final String USERNAME = "postgres";
	private static final String PASSWORD = "test123";
	public DatabaseUtil() {
		try {
			Class.forName(DRIVER_PATH);
		} catch (ClassNotFoundException e) {
			throw new RuntimeException("Something went wrong "+e);
		}
		
	}//End of Constructor
	
	
	public Connection getConnection() throws SQLException {
				return DriverManager.getConnection(DATABASE_URL,USERNAME ,PASSWORD);
	}//End of getConnection

}
