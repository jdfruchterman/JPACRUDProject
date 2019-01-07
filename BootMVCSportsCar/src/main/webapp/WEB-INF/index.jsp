<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
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
<title>Jimmy's Sports Car Database Home Page</title>
</head>
<body>
	<div class="background-image">
		<div class="header">
			<div class="banner">Jimmy's Sports Car Database</div>
			<div class="navigation">
				<nav class="nav nav-tabs">
					<a class="nav-item nav-link active" href="home.do">Home </a> 
					<a class="nav-item nav-link" href="createCar.do" method="GET">Add Car to Database </a>
					<a class="nav-item nav-link" href="createEngine.do" method="GET">Add Engine to Database </a>
					<a class="nav-item nav-link" href="listCars.do" method="GET">List All Cars </a>
					<a class="nav-item nav-link" href="listEngines.do" method="GET">List All Engines </a>
				</nav>
			</div>
		</div>
		<div class="container">

			<!-- 		<div class="container"> -->
			<h4>
				<a href="createCar.do" method="GET">Add a car to the database</a>
			</h4>
			<h4>
				<a href="createEngine.do" method="GET">Add an engine to the database</a>
			</h4>
			<h4>
				<a href="listCars.do" method="GET">List all cars in database</a>
			</h4>
			<h4>
				<a href="listEngines.do" method="GET">List all engines in database</a>
			</h4>

			<h4>Find a car by ID</h4>
			<form action="getCar.do" method="GET">
				Car ID: <input type="text" name="id" /> <input type="submit"
					value="Find Car" class="btn btn-primary" />
			</form>
			<h4>Find a car by keyword</h4>
			<form action="getCarByKeyword.do" method="GET">
				Car ID: <input type="text" name="keyword" /> <input type="submit"
					value="Find Car" class="btn btn-primary" />
			</form>
			
			

			<h4>Edit a car in the database</h4>
			<form action="editCar.do" method="GET">
				Car ID: <input type="text" name="id" /> <input type="submit"
					value="Edit Car" class="btn btn-primary" />
			</form>

			<h4>Delete a car from the database</h4>
			<form action="deleteCar.do" method="GET">
				Car ID: <input type="text" name="id" /> <input type="submit"
					value="Delete Car" class="btn btn-primary" />
			</form>
		</div>
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