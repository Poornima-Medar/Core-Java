<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"  %>
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
	   <div class="text-center text-primary mt-5">
	    <h1>${Header}</h1>
	    </div>
		<form action="processform" method="post">
			<div class="form-group w-28 p-2">
				<label for="inputCity" class="form-label">Name</label> <input
					type="text" name="name" class="form-control" id="inputCity">
			</div>
			<br>
			<div class="form-group w-28 p-2">
				<label for="inputEmail4" class="form-label">Email</label> <input
					type="email" name="email" class="form-control" id="inputEmail4">
			</div>
			<div class="form-group w-28 p-2">
				<label for="inputPassword4" class="form-label">Password</label> <input
					type="password" name="password" class="form-control" id="inputPassword4">
			</div>
			<div class="form-group w-28 p-2">
				<label for="inputAddress" class="form-label">Address</label> <input
					type="text" name="address" class="form-control" id="inputAddress"
					placeholder="1234 Main St">
			</div>
			<div class="form-group w-28 p-2">
				<label for="inputCity" class="form-label">City</label> <input
					type="text" name="city" class="form-control" id="inputCity">
			</div>
			<div class="col-12 text-center p-2">
				<button type="submit" class="btn btn-primary">Submit</button>
			</div>
		</form>

	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.7/dist/umd/popper.min.js"
		integrity="sha384-zYPOMqeu1DAVkHiLqWBUTcbYfZ8osu1Nd6Z89ify25QV9guujx43ITvfi12/QExE"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.min.js"
		integrity="sha384-Y4oOpwW3duJdCWv5ly8SCFYWqFDsfob/3GkgExXKV4idmbt98QcxXYs9UoXAB7BZ"
		crossorigin="anonymous"></script>

</body>
</html>