<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<sql:setDataSource var="db" driver="org.postgresql.Driver"
		url="jdbc:postgresql://localhost:5432/employee" user="postgres"
		password="test123" />
	<sql:query var="rs" dataSource="${db}">select * from department</sql:query>
	
	
	<c:forEach items="${rs.rows}" var="row">
	<c:out value="${row.dept_no}"></c:out>
	<c:out value="${row.dept_name}"></c:out>
	<c:out value="${row.dept_location }"></c:out><br>
	</c:forEach>
	

</body>
</html>