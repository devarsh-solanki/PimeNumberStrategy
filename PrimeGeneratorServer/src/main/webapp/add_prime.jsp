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
		<br> <br>
		<h2 style="letter-spacing: 0.5px" class="text-center">|| PRIME
			NUMBER GENERATOR ||</h2>
		<br>
		<form action="SaveServlet" method="post">
			<div class="mb-3">
				<label for="name" class="form-label">Username</label> <input
					type="text" class="form-control" id="name"
					aria-describedby="emailHelp" required name="name"
					placeholder="Type here...">
			</div>
			<label for="check-ok" name="radio-check" class="form-label">
				Prime Strategy </label>
			<div class="container">
				<div class="form-check">
					<input class="form-check-input" type="radio" name="check-ok"
						value="NativePrime1" id="check-ok1"> <label
						class="form-check-label" for="check-ok1"> NativePrime1 </label>
				</div>
				<div class="form-check">
					<input class="form-check-input" type="radio" name="check-ok"
						value="NativePrime2" id="check-ok2" checked> <label
						class="form-check-label" for="check-ok2"> NativePrime2 </label>
				</div>
				<div class="form-check">
					<input class="form-check-input" type="radio" name="check-ok"
						value="SieveOfEratosthenes" id="check-ok3" checked> <label
						class="form-check-label" for="check-ok3">
						SieveOfEratosthenes </label>
				</div>
				<div class="form-check">
					<input class="form-check-input" type="radio" name="check-ok"
						value="SieveBooleanPrimeMethod" id="check-ok4" checked> <label
						class="form-check-label" for="check-ok4">
						SieveBooleanPrimeMethod </label>
				</div>

			</div>
			<br>
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
			<div class="container text-center mt-4">
				<button type="submit" class="btn btn-col"
					style="letter-spacing: 0.5px; min-width: 100px;">SUBMIT</button>
				<button type="reset" class="btn btn-rel"
					style="letter-spacing: 0.5px; min-width: 100px;">RESET</button>
			</div>
		</form>
	</div>
	<br> <br> <br> <br>
	<footer class="container bg-light text-center text-lg-start">
		<!-- Copyright -->
		<div class="text-center p-3"
			style="background: #410fa8; color: white; letter-spacing: 0.5px;">
			© 2022 All rights reserved</div>
		<!-- Copyright -->
	</footer>
</body>
</html>