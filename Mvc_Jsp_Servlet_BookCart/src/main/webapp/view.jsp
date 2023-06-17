<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BookCart</title>
</head>
<body>
	<div class="container w-25 p-2">
		<table class="table table-striped table-bordered">
			<tr>
				<th>Book Title</th>
				<th>Book Genre</th>
			</tr>
			<c:forEach items="${bookList}" var="item">
				<tr>
					<td>${item["book_title"]}</td>
					<td>${item["book_genre"]}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>