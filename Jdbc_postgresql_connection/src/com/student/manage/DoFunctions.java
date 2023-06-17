package com.student.manage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DoFunctions {
	public Connection connect_to_db(String dbname, String user, String pass) {
		Connection conn = null;
		try {
			Class.forName("org.postgresql.Driver");
			conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + dbname, user, pass);
			if (conn != null) {
				System.out.println("Connection is established");
			} else {
				System.out.println("Failed");
			}
		} catch (Exception e) {
			System.out.println(e);

		}
		return conn;
	}

	public void createTable(Connection conn, String table_name) {
		Statement statement;
		try {
			String query = "create table " + table_name
					+ "(user_name varchar(100),user_password varchar(100));";
			statement = conn.createStatement();
			statement.executeUpdate(query);
			System.out.println("Table created");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void insert_Row(Connection conn, String table_name, String user_name, String user_password) {
		Statement statement;
		try {
			String query = String.format("insert into %s(user_name,user_password) values('%s','%s');", table_name,
					user_name,user_password);
			statement = conn.createStatement();
			statement.executeUpdate(query);
			System.out.println("inserted");
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

		try {

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void read_data(Connection conn, String table_name) {
		Statement statement;
		ResultSet rs = null;
		try {
			String q = String.format("select * from %s", table_name);
			statement = conn.createStatement();
			rs = statement.executeQuery(q);
			while (rs.next()) {
				System.out.print(rs.getString("studentID") + " ");
				System.out.print(rs.getString("sfname") + " ");
				System.out.print(rs.getString("slname") + " ");
				System.out.println(rs.getString("sphone") + " ");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void update_data(Connection conn, String table_name, String old_sfname, String new_sfname) {
		Statement statement;
		try {
			String q = String.format("update %s set sfname='%s' where sfname='%s'", table_name, new_sfname, old_sfname);
			// String q = ("update "+table_name+" set sfname="+new_sfname+" where
			// sfname="+old_sfname+";");
			statement = conn.createStatement();
			statement.executeUpdate(q);
			System.out.println("Updated");

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void search_ByName(Connection conn, String table_name, String name) {
		Statement statement;
		ResultSet rs = null;
		try {
			String query = String.format("select * from %s where sfname='%s'", table_name, name);
			statement = conn.createStatement();
			rs = statement.executeQuery(query);
			while (rs.next()) {
				System.out.print(rs.getString("studentId") + " ");
				System.out.print(rs.getString("sfname") + " ");
				System.out.print(rs.getString("slname") + " ");
				System.out.println(rs.getString("sphone") + " ");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public void search_ById(Connection conn, String table_name, int id) {
		Statement statement;
		ResultSet rs = null;
		try {
			String query = String.format("select * from %s where studentId=%s", table_name, id);
			statement = conn.createStatement();
			rs = statement.executeQuery(query);
			while (rs.next()) {
				System.out.print(rs.getString("studentId") + " ");
				System.out.print(rs.getString("sfname") + " ");
				System.out.print(rs.getString("slname") + " ");
				System.out.println(rs.getString("sphone") + " ");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
	public void delete_Row_ByName(Connection conn,String table_name,String name) {
		Statement statement;
		try {
			String query = String.format("delete from %s where sfname='%s'",table_name,name);
			statement = conn.createStatement();
			statement.executeUpdate(query);
			System.out.println("Row is deleted");
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void delete_table(Connection conn,String table_name) {
		Statement statement;
		try {
			String query = String.format("drop table  %s ",table_name);
			statement = conn.createStatement();
			statement.executeUpdate(query);
			System.out.println("table deleted");
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void credentials(Connection conn, String user_name, String user_password) {
		try {
			String q =  String.format("select * from users where user_name='%s' and user_password='%s'", 
					user_name,user_password);
			Statement statement = conn.createStatement();
			ResultSet resultSet = statement.executeQuery(q);
			
			if(resultSet.next()) {
				System.out.println("Valid credential");
			}else {
				System.out.println("invalid credentials");
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
	public void sqlInjectionPrevent(Connection conn, String user_name, String user_password) {
		try {
			String q =  String.format("select * from users where user_name=? and user_password=?", 
					user_name,user_password);
			PreparedStatement preparedStatement = conn.prepareStatement(q);
			preparedStatement.setString(1, user_name);
			preparedStatement.setString(2, user_password);
			
			
			ResultSet resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				System.out.println("Valid credential");
			}else {
				System.out.println("invalid credentials");
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
		
	}

}