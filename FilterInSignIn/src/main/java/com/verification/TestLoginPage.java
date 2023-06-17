package com.verification;

import java.io.IOException;



import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

public class TestLoginPage implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest)request;
		HttpSession s = req.getSession();
	    String username = (String)s.getAttribute("userName");
	    if(username == "Poornima") {
	    	chain.doFilter(request, response);
	    }else {
	    	System.out.println("Incorrect Credntials");
	    }
		
	}

}
