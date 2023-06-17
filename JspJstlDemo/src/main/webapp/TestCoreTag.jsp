<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="T"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>This is test page</p>


	<T:import var="data" url="https://google.com"></T:import>



	<T:catch var="catchTheException">
		<%
		int a = 2 / 0;
		%>
	</T:catch>

	<T:if test="${catchTheException != null}">
		<p>
			The type of exception is : ${catchtheException} <br /> There is an
			exception: ${catchtheException.message}
		</p>
	</T:if>


	<T:forEach var="j" begin="1" end="3">  
   Item <T:out value="${j}" />
		<p>
	</T:forEach>


	<T:set var="income" value="${10000}"></T:set>
	<T:out value="${income}"></T:out>

	<T:choose>
		<T:when test="${income<50000}">
			<P>Ur income is to low</P>
		</T:when>
		<T:when test="${income>100000 }">
			<p>Hi your income is stable</p>
		</T:when>
		<T:otherwise>
			<p>Something went wrong</p>
		</T:otherwise>
	</T:choose>
</body>
</html>