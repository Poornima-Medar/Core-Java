package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ThirdServlet extends HttpServlet {
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		System.out.println("This is get method.........");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<h1>This is the get method of my servlet </h1>");
		out.println(new Date().toString());
	}
	 

}
