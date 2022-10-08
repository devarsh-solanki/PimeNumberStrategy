<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>|| PRIME GENERATOR ||</title>
<%@include file="all_css_js.jsp"%>
</head>
<body>
	<div class="container">
		<%@include file="Navbar.jsp"%>
		<br> <br>
		<h2 style="letter-spacing: 0.5px" class="text-center">|| PRIME
			NUMBER GENERATOR ||</h2>
		<br> <br>
		<div class="card">
			<div class="card-ok" style="margin: 25px; padding: 25px;">
				<h1>What are prime numbers?</h1>
				<ul>
					<li>A prime number is a natural number greater than 1, which
						is only divisible by 1 and itself. First few prime numbers are: 2
						3 5 7 11 13 17 19 23...</li>
				</ul>
				<div class="text-center">
					<img class="prime-img" src="img/Primenumbers.jpg"
						alt="Prime number image...">
				</div>
				<br>
				<ul>
					<li>In other words, the prime number is a positive integer
						greater than 1 that has exactly two factors, 1 and the number
						itself.</li>
					<li>There are many prime numbers, such as 2, 3, 5, 7, 11, 13,
						etc.</li>
					<li>Keep in mind that 1 cannot be either prime or composite.</li>
					<li>The remaining numbers, except for 1, are classified as
						prime and composite numbers.</li>
				</ul>
				<br>
				<div>
					<h4>Different Prime generator strategy :</h4>
					<ul>
						<li>NativePrime1</li>
						<li>NativePrime2</li>
						<li>SieveBooleanPrimeMethod</li>
						<li>SieveOfEratosthenes</li>
					</ul>
				</div>
				<br>
				<div>
					<h4>Properties of prime numbers:</h4>
					<ul>
						<li>Every number greater than 1 can be divided by at least
							one prime number.</li>
						<li>Every even positive integer greater than 2 can be
							expressed as the sum of two primes.</li>
						<li>Except 2, all other prime numbers are odd. In other
							words, we can say that 2 is the only even prime number.</li>
						<li>Two prime numbers are always coprime to each other.</li>
						<li>Each composite number can be factored into prime factors
							and individually all of these are unique in nature.</li>
					</ul>
				</div>
				<br>
				<div class="text-center">
					<a href="add_prime.jsp" class="btn btn-del"
						style="margin-left: 5px; letter-spacing: 0.5px;">ADD PRIME</a>
				</div>
			</div>
		</div>
		<br> <br>
	</div>
	<footer class="container bg-light text-center text-lg-start">
		<!-- Copyright -->
		<div class="text-center p-3"
			style="background: #410fa8; color: white; letter-spacing: 0.5px;">
			© 2022 All rights reserved</div>
		<!-- Copyright -->
	</footer>
</body>
</html>
