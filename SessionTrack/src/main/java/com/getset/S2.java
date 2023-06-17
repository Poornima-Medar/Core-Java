package com.getset;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class S2 extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 String name = req.getParameter("name");
		 resp.setContentType("text/html");
		 
		 Cookie[] c = req.getCookies();
			
	        PrintWriter out = resp.getWriter();
	        out.println("<h1>Hello, "+ c[0].getValue()+" "+"Welocome back to mywebsite</h1>");
			out.println("<h1>Thank you </h1>");	
	}

}
