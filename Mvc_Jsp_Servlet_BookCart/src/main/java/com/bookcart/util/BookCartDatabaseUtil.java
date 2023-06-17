package com.bookcart.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bookcart.model.Book;

public class BookCartDatabaseUtil {
	private static final String url = "jdbc:postgresql://localhost:5432/Book";
	private static final String user = "postgres";
	private static final String password = "test123";
	static Connection connection;

	public Connection getDatabaseConnection() {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			connection = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
}
