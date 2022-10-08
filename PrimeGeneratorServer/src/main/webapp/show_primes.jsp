<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page import="com.factory.factoryProvider"%>
<%@ page import="org.hibernate.Session"%>
<%@ page import="javax.persistence.Query"%>
<%@ page import="java.util.List"%>
<%@ page import="com.entities.Prime"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SHOW PRIMES || JSP</title>
<%@include file="all_css_js.jsp"%>
</head>
<body>
	<div class="container p-12">
		<%@include file="Navbar.jsp"%>
		<br> <br>
		<h3 class="text-center" style="letter-spacing: 0.5px; padding-top: 5px; padding-bottom: 5px;">|| SHOW ALL USERS ||</h3>
		<br>
		<div class="row">
			<div class="col-12">
				<%
				Session sn = factoryProvider.getfactory().openSession();
				Query q = sn.createQuery("from Prime");

				List<Prime> list = q.getResultList();

				for (Prime prime : list) {
				%>

				<div class="card mt-3">
					<div class="container text-center">
						<img src="img/prime.png"
							class="card-img-top mega-img text-center m-3 float-left"
							alt="...">
					</div>
					<div class="card-body">

						<h3 class="card-id" style="color: black;"> User Id : <%= prime.getId() %></h3>
						<hr>
						<h4 class="card-name"> UserName : <%= prime.getName() %></h4>
						<h5 class="card-name"> LowerBound : <%= prime.getLowerLimit() %></h5>
						<h5 class="card-name"> UpperBound : <%= prime.getUpperLimit() %></h5>
						<h5 class="card-name"> Prime number generator algorithm : <%= prime.getPrimeSrategy() %></h5>
						<h5 class="card-name"> Total prime numbers between the range : <%= prime.getList() %></h5>
						<h5 class="card-name"> Algorithm runtime : <%= prime.getExecutionTime() %> ms </h5>
						<br>
						<h4 class="card-text" style="direction: ltr;"><%= prime.getTime() %></h4>
						<div class="container text-center">
							<a href="deleteServlet?note_id=<%= prime.getId() %>" class="btn btn-del" style="margin-left: 5px">Delete</a>
						</div>
					</div>
				</div>

				<%
				}
				%>
			</div>
		</div>
	</div>
	<br>
</body>
</html>