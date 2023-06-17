package com.student.manage;

import java.sql.Connection;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		DoFunctions db = new DoFunctions();
		Connection conn = db.connect_to_db("student", "postgres", "test123");
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" enter user name");
		String userName = sc.nextLine();
		System.out.println("Enter password");
		String userPassword =sc.nextLine();
		
		//db.credentials(conn, userName, userPassword);
		db.sqlInjectionPrevent(conn, userName, userPassword);

		
		sc.close();
	}
}
