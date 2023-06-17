<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body class="" style="background: #e2e2e2;">

	<div class="container mt-4">
		<div class="row">
			<div class="col-md-8 offset-md-2">
				<div class="card">
					<div class="card-body">
						<h2 class="text-center">Form</h2>
						<div class="alert alert-danger" role="alert">
							<form:errors path="student.*" />
						</div>

						<form action="handle" method="post">
							<div class="form-group">
								<label>Name </label><input name="name" type="text"
									class="form-control" placeholder="Enter your name">
							</div>
							<div class="form-group">
								<label>Id </label><input name="id" type="text"
									class="form-control" placeholder="Enter your Id">
							</div>
							<div class="form-group">
								<label>Date of Birth</label><input name="date" type="date"
									class="form-control" placeholder="mm/dd/yyyy">
							</div>
							<div class="form-group">
								<label>Course</label><select name="course" class="form-control"
									multiple>
									<option value="java">Java</option>
									<option value="c">C</option>
									<option value="c++">C++</option>
									<option value="python">Python</option>
								</select>
							</div>
							<div class="form-group">
								<span>Select Gender</span>
								<div class="form-check form-check-inline">
									<input class="form-check-input" type="radio" name="gender"
										id="inlineRadio2" value="male"> <label
										class="form-check-label" for="inlineRadio2">Male</label>
								</div>
								<div class="form-check form-check-inline">
									<input class="form-check-input" type="radio" name="gender"
										id="inlineRadio2" value="female"> <label
										class="form-check-label" for="inlineRadio2">Female</label>
								</div>
							</div>
							<div class="form-group">
								<label>Sem</label><select name="sem" class="form-control">
									<option value="first">first</option>
									<option value="second">second</option>
									<option value="third">third</option>
									<option value="foruth">foruth</option>
								</select>
							</div>
							<div class="card">
								<div class="card-body">
									<p>Address</p>
									<div class="form-group">
										<label>Street </label><input name="address.street" type="text"
											class="form-control" placeholder="Enter your Street">
									</div>
									<div class="form-group">
										<label>City</label><input name="address.city" type="text"
											class="form-control" placeholder="Enter your City">
									</div>

								</div>
							</div>
							<div class="container text-center mt-2">
								<button type="submit" class="btn btn-primary">Submit</button>
							</div>


						</form>

					</div>
				</div>
			</div>
		</div>

	</div>

</body>
</html>