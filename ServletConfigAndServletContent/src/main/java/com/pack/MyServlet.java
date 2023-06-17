package com.pack;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
/**
 * 
 * ServletConfig and ServletContext
 *
 */
public class MyServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		PrintWriter out = resp.getWriter();
		
		ServletContext servletContext = getServletContext();
		String str = servletContext.getInitParameter("Name");
		out.print("<h1> My name is "+str+" </h1>");
	}
	

}
