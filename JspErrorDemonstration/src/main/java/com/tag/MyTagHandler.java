package com.tag;



import java.util.Date;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.TagSupport;

public class MyTagHandler extends TagSupport{

	@Override
	public int doStartTag() throws JspException {
		try {
			JspWriter out = pageContext.getOut();
			out.println("<h1> This is my Jsp custom tag </h1>");
			out.println("<p> This how a custom tag </p>");
			out.println(new Date().toString());
		}catch(Exception e) {
			e.printStackTrace();
		}
		return SKIP_BODY;
	}
	
}
