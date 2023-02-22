<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

<title>Reset Password</title>
<style>

.register-box {
	position: absolute;
	top: 60%;
	left: 50%;
	width: 500px;
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
       <button href="admin.jsp" class="btn btn-outline-black" type="submit">Home</button>
    </form>
  </div>
  
  
</nav>
<br><br><br>
<br>

<form action="mall" method="post">
<div class="register-box">
<div>
<label for="currentPassword">Current Password :</label>
  <input type="password" id="currentPassword" name="currentPassword"/>
</div>
<br>
<div>
<label for="newPassword">New Password :</label>
  <input type="password" id="newPassword" name="newPassword"/>
</div>
<br>
<div>
<label for="confirmNewPassword">Confirm New Password :</label>
  <input type="password" id="confirmNewPassword" name="confirmNewPassword"/>
</div>
   
<br>
<br>
<center>
<button align="center" type="submit" class="btn btn-dark">Submit</button> 
</center>
</div>
</form>


<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

</body>
</html>