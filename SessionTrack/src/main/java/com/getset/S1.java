package com.getset;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class S1 extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		
		String name = req.getParameter("name");
		
		Cookie c = new Cookie("user_name",name);
		resp.addCookie(c);
		
		out.println("<h1>Hello, "+name+" "+"Welocome to mywebsite</h1>");
		out.println("<h1><a href='servlet2'>Go to servlet 2 </h1>");		
	}	

}
