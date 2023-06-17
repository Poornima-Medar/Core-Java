<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello World</h1>
	<c:set var="name" value="${'Poornima'}"></c:set>
	<c:out value="${ name}"></c:out>

	<c:out value="${fn:length(name)}"></c:out>
	<c:out value="${fn:toUpperCase(name) }"></c:out>
</body>
</html>