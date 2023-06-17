package com.form;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/userlogin")
public class Login extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("user_name");
		String email = req.getParameter("user_email");
		String password = req.getParameter("user_password");
		
		Cookie c1 = new Cookie("user_name",name);
		Cookie c2 = new Cookie("user_email",email);
		Cookie c3 = new Cookie("user_password",password);
		
		resp.addCookie(c1);
		resp.addCookie(c2);
		resp.addCookie(c3);
		
		resp.sendRedirect("profile");

	}
	

}
