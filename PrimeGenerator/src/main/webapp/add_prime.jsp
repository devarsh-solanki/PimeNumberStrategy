<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@include file="all_css_js.jsp"%>
</head>
<body>
	<div class="container">
		<%@include file="Navbar.jsp"%>
		<br>
		<form action="">
			<div class="mb-3">
				<label for="name" class="form-label">Username</label> <input
					type="text" class="form-control" id="name"
					aria-describedby="emailHelp" required name="name"
					placeholder="Type here...">
			</div>
			<div class="dropdown">
				<label for="strategy" class="form-label">Prime Strategy</label> <br>
				<button class="btn btn-secondary dropdown-toggle" type="button"
					id="strategy" data-bs-toggle="dropdown" aria-expanded="false">Choose
					Algorithm</button>
				<ul class="dropdown-menu" aria-labelledby="dropdownMenuButton1" style=width: 200px;">
					<li><a class="dropdown-item" href="#">Nativeprime1</a></li>
					<li><a class="dropdown-item" href="#">NativePrime2</a></li>
				</ul>
			</div><br>
			<div class="mb-3">
				<label for="lower" class="form-label">Lower Limit </label> <input
					type="number" class="form-control" id="lower"
					aria-describedby="emailHelp" required name="lower"
					placeholder="Enter lower bound...">
			</div>
			<div class="mb-3">
				<label for="upper" class="form-label">Upper Limit</label> <input
					type="number" class="form-control" id="upper" required name="upper"
					placeholder="Enter upper bound...">
			</div>
			<button type="submit" class="btn btn-col"
				style="letter-spacing: 0.5px; min-width: 100px;">ADD</button>
			<button type="reset" class="btn btn-del"
				style="letter-spacing: 0.5px; min-width: 100px;">RESET</button>
		</form>
	</div>
</body>
</html>