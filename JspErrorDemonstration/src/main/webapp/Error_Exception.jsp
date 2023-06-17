<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sorry ! something went wrong</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>
<div class="container">
<img alt="" src="image/error.png" class="img-fluid">
<h1 class="display-3">Sorry ! something went wrong</h1>
<p class="offset-md-4 text-danger"><%= exception %></p> 
<a class="btn btn-outline-primary offset-md-5" href="index.html">Home Page</a>
</div>

</body>
</html>