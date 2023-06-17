<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>
<div class="container">
		<h1>Upload file</h1>
		<form action="uploadimage" method="post" enctype="multipart/form-data">
			<div class="form-group">
				<label for="exampleFormControlFile1">Choose Image</label> <input
					type="file" name="image" class="form-control-file" id="exampleFormControlFile1">
			</div>
			<button class="btn btn-outline-success">Upload</button>
		</form>
	</div>
</body>
</html>