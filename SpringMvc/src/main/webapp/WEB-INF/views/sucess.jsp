<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<%-- <h1>Hi, ${name}</h1>
<h1>Your email address is ${email}</h1>
<h1>Your Password is ${password}</h1>
<h1>Address is ${address}</h1>
<h1>City ${city}</h1> --%>
		<br>
		<div class="text center">
			<h1>${Header}</h1>
		</div>
	</div>
	<h1>${student.name}</h1>
	<h1>${student.email}</h1>
	<h1>${student.password}</h1>
	<h1>${student.address}</h1>
	<h1>${student.city}</h1>


</body>
</html>