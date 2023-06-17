<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Hi........</h1>
	<%
	String dbname = "employee";
	String user = "postgres";
	String password = "test123";
	String sql = "SELECT * FROM department where dept_no=1 ";
	Class.forName("org.postgresql.Driver");
	Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + dbname, user, password);
	Statement st = connection.createStatement();
	
	ResultSet rs = st.executeQuery(sql);
	rs.next();	
	%>
	
	Dept no:  <%=rs.getInt(1) %><br>
	Dept name:  <%= rs.getString(2) %><br>
	Dept location:  <%= rs.getString(3) %>
</body>
</html>