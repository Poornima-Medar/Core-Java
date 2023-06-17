<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Hi, Good Afternoon</h1>
	<%
	/* 	String name = (String) request.getAttribute("name");
		int id = (Integer) request.getAttribute("id");
		LocalDateTime time = (LocalDateTime)request.getAttribute("time");
	 */
	%>
	<h2>
		<%-- <%=name%> --%>
		${name}
	</h2>
	<h3>
		<%-- <%=id%> --%>
		${id}
	</h3>
	<h3>
		<%-- Time: <%= time.toString()%> --%>
		Time: ${time}
	</h3>

	<hr>
	<h3>
		<c:forEach var="item" items="${num}">
		<h2><c:out value="${item}"></c:out></h2>
			<%-- ${item} --%>
		</c:forEach>
	</h3>
</body>
</html>