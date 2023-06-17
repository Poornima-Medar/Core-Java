package com.servlets;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;


public class AddServlet implements Servlet{
	//Life cycle methods
	ServletConfig Conf;
	
	public void init(ServletConfig conf) {
		this.Conf=conf;
	    System.out.println("Creating object");	
	}
	
	public void service(ServletRequest req, ServletResponse resp) throws IOException,ServletException{
		System.out.println("Servicing........");
		//Setth content type of the response
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<h1>this is the output from servlet method:</h1>");
		out.println("<h1>Todays date and time is:"+new Date().toString()+"</h1>");
		
		
	}
	public void destroy() {
		System.out.println("going to destroy servlet object");
	}

	//non life cycle methods
	public ServletConfig getServletConfig() {
		return this.Conf;
	}
	
	public String getServletInfo() {
		return "Hello";
		
	}

	

}
