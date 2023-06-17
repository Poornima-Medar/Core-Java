package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<h2>Welcome to register Servlet</h2>");
		String name = req.getParameter("user_name");
		String email = req.getParameter("user_email");
		String password = req.getParameter("user_password");
		String gender = req.getParameter("user_gender");
		String course = req.getParameter("user_course");
		String cond = req.getParameter("condition");

		if (cond != null) {
			if (cond.equals("checked")) {
				out.println("<h2> name :" + name + "</h2>");
				out.println("<h2> email :" + email + "</h2>");
				out.println("<h2> password :" + password + "</h2>");
				out.println("<h2> gender :" + gender + "</h2>");
				out.println("<h2> course :" + course + "</h2>");

				RequestDispatcher rd = req.getRequestDispatcher("final");
				rd.forward(req, res);
			}
		} else {
			out.println("<h2>you have not accepted condition</h2>");

			// want to include object of index.html

			// get the object of RequestDispatcher

			RequestDispatcher rd = req.getRequestDispatcher("index.html");

			// include method
			rd.include(req, res);

		}
	}

}
