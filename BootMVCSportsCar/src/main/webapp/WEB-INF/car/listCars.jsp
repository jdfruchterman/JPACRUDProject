<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">

<style type="text/css"></style>
<link rel="stylesheet" type="text/css" href="index.css">
<meta charset="UTF-8">
<title>Jimmy's Sports Car Database - Find a car in the database</title>
</head>
<body>
	<div class="background-image">
		<div class="header">
			<div class="banner">Jimmy's Sports Car Database</div>
			<div class="navigation">
				<nav class="nav nav-tabs">
					<a class="nav-item nav-link active" href="home.do">Home </a> <a
						class="nav-item nav-link" href="createCar.do" method="GET">Add
						Car to Database </a>
				</nav>
			</div>
		</div>
		<c:forEach items="${car}" var="carVar">
		<div class="container">
			<h4>${carVar.year} ${carVar.make} ${carVar.model}</h4>
			<h5>Car Id: ${carVar.id }</h5>
			<h5>Specifications:</h5>
			<p>
			<div>
				<ul>
					<li>Trim: ${carVar.trim}</li>
					<li>Doors: ${carVar.doors }</li>
					<li>Engine Layout: ${carVar.engineLayout }</li>
					<li>Weight: ${carVar.weight }</li>
					<li>Horsepower: ${carVar.horsepower }</li>
					<li>Torque(ft/lbs): ${carVar.torque }</li>
					<li>0 to 60: ${carVar.zerotosixty }</li>
					<li>Engine: ${carVar.engine.name }</li>
					<li>Displacement: ${carVar.engine.displacement }</li>
					<li>Cylinders: ${carVar.engine.cylinders }</li>
					<li>Configuration: ${carVar.engine.configuration}</li>
					 
				</ul>
			</div>
		</div>
		</c:forEach>
 	</div>

	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
		integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
		integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
		crossorigin="anonymous"></script>
</body>
</html>