<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Success</title>
</head>
<body>

<nav class="navbar navbar-secondary bg-secondary">
  <div class="container-fluid">
    <a class="navbar-brand">
     <img src="https://img.freepik.com/free-vector/shopping-mall-outside-composition-mall-building-with-tags-headlines-shops-wall_1284-58788.jpg?w=2000" alt="" width="75" height="75" class="d-inline-block align-text-top">
   </a>
    <form class="d-flex">
    <!--  <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">-->
       <button href="customerDetail.jsp" class="btn btn-outline-black" type="submit">Home</button>
    </form>
  </div>
    
</nav>

<br><br><br>
<div>
<form action="send" method="post">
<table class="table table-bordered table-striped">
  <thead class="thead-dark-50">
    		<tr>
     				<th scope="col">Id</th>
	 				<th scope="col">Name</th>
					<th scope="col">Email</th>
					<th scope="col">MobileNo</th>
					<th scope="col">Age</th>
					<th scope="col">Country</th>
					<th scope="col">State</th>
					<th scope="col">City</th>
					<th scope="col">Pincode</th>
    		</tr>
  </thead>
  <tbody>

    		<tr>
     				<th scope="row">${entity.customer_id}</th>
					<td>${entity.name}</td>
					<td>${entity.email}</td>
					<td>${entity.mobileNo}</td>
					<td>${entity.age}</td>
					<td>${entity.country}</td>
					<td>${entity.state}</td>
					<td>${entity.city}</td>
					<td>${entity.pincode}</td>
    		</tr>
 </tbody> 
 </table> 
 </form>
</div>


<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>


</body>
</html>