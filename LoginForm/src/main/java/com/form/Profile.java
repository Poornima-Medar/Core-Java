package com.form;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/profile")
public class Profile extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	Cookie[] c = req.getCookies();
	
	if(c==null) {
		resp.sendRedirect("index.html");
	}
	else {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		out.println("<h1>Nmae: "+c[0].getValue()+"</h1>");
		out.println("<h1>Email: "+c[1].getValue()+"</h1>");
		out.println("<h1>Password: "+c[2].getValue()+"</h1>");
		out.println("<a href='logout'>Logout</a>");
	}
	}
	
	
	

}
