<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="T" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<T:set var="i" value="23" scope="page"></T:set>

<h1><T:out value="${ i}"></T:out></h1>

<T:remove var="i"></T:remove>
<h1><T:out value="${ i}"></T:out>Removed</h1>

<T:set var="n1" value="3" scpe="application"></T:set>
<T:if test="${n1>4}">
<h1>Hi Poornima</h1>
</T:if>
</body>
</html>