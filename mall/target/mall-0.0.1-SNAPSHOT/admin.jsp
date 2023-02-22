<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

<title>Mall</title>
<style>

.register-box {
	position: absolute;
	top: 60%;
	left: 50%;
	width: 550px;
	padding: 40px;
	transform: translate(-50%, -50%);
	background: white;
	box-shadow: 0 15px 25px rgba(143, 124, 236, 0.7);
	border-radius: 10px;
}
</style>
</head>
<body>

<nav class="navbar navbar-secondary bg-secondary">
  <div class="container-fluid">
    <a class="navbar-brand">
     <img src="https://img.freepik.com/free-vector/shopping-mall-outside-composition-mall-building-with-tags-headlines-shops-wall_1284-58788.jpg?w=2000" alt="" width="75" height="75" class="d-inline-block align-text-top">
   </a>
    <form class="d-flex">
    <!--  <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">-->
       <button href="index.jsp" class="btn btn-outline-black" type="submit">Home</button>
    </form>
  </div>
  
  
</nav>
<center>
<h1>This is admin panel page</h1>
<p class="text-success">${message}</p>
</center>
<br><br><br>
<br>
<form action="mall" method="post">
<div class="register-box">
<div>
<label for="adminName">Admin Name :</label>
  <input type="text" id="adminName" name="adminName"/>
</div>
<br>
<div>
<label for="adminPassword">Admin Password :</label>
  <input type="password" id="adminPassword" name="adminPassword"/>
</div>
<br>
<div>
Mall Name :&nbsp;&nbsp;&nbsp;&nbsp;<select name="mallName" id="mallName" class="form-select">
<option>--Select--</option>
<option>UB City</option>
<option>Orion Mall</option>
<option>Forum Mall</option>
<option>Mantri Sqaure</option>
<option>Bangalore Central Mall</option>
<option>Garuda Mall</option>
<option>Royal Meenakshi Mall</option>
<option>Vega City Mall</option>
<option>Forum Centre City Mall</option>
<option>Mall Of Mysore</option>
<option>Gopalan Arcade Mall</option>
<option>GT World Mall</option>
<option>Lulu Mall</option>
<option>Phoenix Marketcity</option>
</select>
</div>

<br><br>
<a href="reset.jsp" class="text-right" style="color:secondary;">Reset password</a>


&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="newp.jsp" style="color:secondary;">forgot password</a>

   
   
<br>
<br>
<center>
<a href="customer.jsp" align="center" type="submit" class="btn btn-dark">Login</a> 
</center>
</div>
</form>


<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

</body>
</html>