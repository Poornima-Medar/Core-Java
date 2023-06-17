package com.loginForm;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class Login extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		String userName = req.getParameter("userName");
		String password = req.getParameter("password");
		
		if(userName.equals("Poornima") && password.equals("@Poorni98")) {
			HttpSession session = req.getSession();
			session.setAttribute("userName", userName);
			resp.sendRedirect(req.getContextPath()+ "/welcome");
		}else {
			out.println("Oops incorrect userName and Password");
		}
	}
	

}
