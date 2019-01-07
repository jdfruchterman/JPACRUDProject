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
<title>Jimmy's Sports Car Database - Add Car</title>
</head>
<body>
	<div class="background-image">
		<div class="header">
			<div class="banner">Jimmy's Sports Car Database</div>
			<div class="navigation">
				<nav class="nav nav-tabs">
					<a class="nav-item nav-link" href="home.do">Home </a> 
					<a class="nav-item nav-link active" href="createCar.do" method="GET">Add Car to Database </a>
					<a class="nav-item nav-link" href="createEngine.do" method="GET">Add Engine to Database </a>
					<a class="nav-item nav-link" href="listCars.do" method="GET">List All Cars </a>
					<a class="nav-item nav-link" href="listEngines.do" method="GET">List All Engines </a>
				</nav>
			</div>
		</div>
		<div class="container">
			<h4>Add a car to the database</h4>
			<form action="createCar.do" method="POST">
				<div class="form-group">
					<label id="make">Make:</label> <input type="text" id="make"
						name="make" value="Toyota"></input>
				</div>
				<div class="form-group">
					<label id="model">Model:</label> <input type="text" id="model"
						name="model" value="Celica"></input>
				</div>
				<div class="form-group">
					<label id="year">Year:</label> <input type="number" id="year"
						name="year" value="2001" required min="1901"></input>
				</div>
				<div class="form-group">
					<label id="trim">Trim:</label> <input type="text" id="trim"
						name="trim" value="GT-S"></input>
				</div>
				<div class="form-group">
					<label id="doors">Doors:</label> <input type="number" id="doors"
						name="doors" value="2" required min="1" required max="10"></input>
				</div>
				<div class="form-group">
					<label id="engine">Engine Layout:</label> <input type="text" id="engineLayout"
						name="engineLayout" value="FF"></input>
				</div>
				<div class="form-group">
					<label id="weight">Weight:</label> <input type="number" id="weight"
						name="weight" value="2500" required min="1" required max="10000"></input>
				</div>
				<div class="form-group">
					<label id="horsepower">Horsepower:</label> <input type="number"
						id="horsepower" name="horsepower" value="180" required min="1"
						required max="10000"></input>
				</div>
				<div class="form-group">
					<label id="torque">Torque:</label> <input type="number" id="torque"
						name="torque" value="133" required min="1" required max="10000"></input>
				</div>
				<div class="form-group">
					<label id="0to60">Zero to sixty:</label> <input type="text"
						id="0to60" name="0to60" value="7.2"></input>
				</div>

				<input type="submit" class="btn btn-primary" value="Submit" />

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