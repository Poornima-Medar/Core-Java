package url_rewriting;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/servlet2")
public class Servlet2 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	   String username = req.getParameter("UserName");
	   String userpassword = req.getParameter("UserPassword");
	   
	   resp.setContentType("text/html");

		PrintWriter out = resp.getWriter();

		out.println("<h1>Name: " + username + "</h1>");
		out.println("<h1>Password: "+userpassword+"</h1>");
	}
	

}
