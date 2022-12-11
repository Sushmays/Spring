<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Bus stop</title>
</head>
<body>

	<nav class="navbar navbar-expand-lg navbar-dark bg-info">
		<a class="navbar-brand" href="#"></a> <img
			src="https://raw.githubusercontent.com/X-workzDev01/xworkzwebsite/master/src/main/webapp/assets/images/Logo.png"
			width="100" height="50" alt="">
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNavAltMarkup">
			<div class="navbar-nav">
				<a class="nav-item nav-link active" href="#">Home <span
					class="sr-only">(current)</span></a>
			</div>
		</div>
		 <form class="form-inline">
    <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
    <button class="btn btn-outline-secondary my-2 my-sm-0" type="submit">Search</button>
  </form>
	</nav>

	<h1>BusStop Detail</h1>
	<p class="text-success">${message}</p>
	<p class="text-danger">${error}</p>
	
	<form action="busstop" method="post">

		StopName <input type="text" name="stopName" ${dto.stopName } /><br>
		<br> BusNo <input type="number" name="busNo" ${dto.busNo } /><br>
		<br> NoOfShops <input type="number" name="noOfShops"
			${dto.noOfShops } /><br>
		<br> Type <input type="text" name="type" ${dto.type } /><br>
		<br> BusColor <input type="text" name="busColor" ${dto.busColor } /><br>
		<br>

		&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input
			type="submit" value="Save" class="btn btn-dark" />
	</form>


	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>


</body>
</html>