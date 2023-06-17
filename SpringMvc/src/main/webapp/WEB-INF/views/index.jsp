<%@page import="com.springmvc.model.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
	<h1>View page using spring mvc</h1>

	<%
	String name = (String) request.getAttribute("name");
	int id = (Integer) request.getAttribute("id");
	List<String> friends = (List<String>) request.getAttribute("f");
	Student s = (Student)request.getAttribute("s");
	%>

	<h1>
		Hi
		<%=name%>
		your id is
		<%=id%>
		name<%=s%>
	</h1>
	<h1>
		and your team members are
		<%
	for (String s1 : friends) {
		%>
		<h2><%=s1%></h2>
		<%
		}
		%>
		
	</h1>


</body>
</html>