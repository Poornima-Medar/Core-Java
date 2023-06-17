package com.Filter;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class ProfileServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {

		resp.setContentType("text/Html;charset=UTF-8");
		try (PrintWriter out = resp.getWriter()) {
			System.out.println("ProductServlet");
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Profile Servlett</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1>WellCome to your Profile page</h1>");
			out.println("<h1>Here is your details</h1>");
			out.println("</body>");
			out.println("</html>");
		}
	}
}
