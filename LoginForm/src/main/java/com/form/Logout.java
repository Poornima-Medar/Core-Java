package com.form;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/logout")
public class Logout extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie[] c = req.getCookies();
		c[0].setMaxAge(0);
		c[1].setMaxAge(0);
		c[2].setMaxAge(0);
		
		resp.addCookie(c[0]);
		resp.addCookie(c[1]);
		resp.addCookie(c[2]);
		
		resp.sendRedirect("index.html");
		
	}

}
