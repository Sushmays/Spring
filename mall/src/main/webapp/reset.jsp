<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">

<title>Reset Password</title>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<style>

.register-box {
	position: absolute;
	top: 60%;
	left: 50%;
	width: 500px;
	padding: 30px;
	transform: translate(-50%, -50%);
	background: white;
	box-shadow: 0 15px 25px rgba(143, 124, 236, 0.7);
	border-radius: 10px;
}
</style>

<script >
 $(document).ready(function(){
	$('.pass_show').append('<span class="ptxt">Show</span>');  
	});
	  
	$(document).on('click','.pass_show .ptxt', function()
			{ 
	$(this).text($(this).text() == "Show" ? "Hide" : "Show"); 
	$(this).prev().attr('type', function(index, attr){return attr == 'password' ? 'text' : 'password'; }); 
	});  
	
</script>
</head>
<body>

<nav class="navbar navbar-secondary bg-secondary">
  <div class="container-fluid">
    <a class="navbar-brand">
     <img src="https://img.freepik.com/free-vector/shopping-mall-outside-composition-mall-building-with-tags-headlines-shops-wall_1284-58788.jpg?w=2000" alt="" width="75" height="75" class="d-inline-block align-text-top">
   </a>
    <form class="d-flex">
    <!--  <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">-->
       <a href="admin.jsp" class="btn btn-outline-black" type="submit">Home</a>
    </form>
  </div> 
</nav>
<br><br><br>
<br>

<p class="text-success">${message}</p>
<form action="reset" method="get">

<div class="register-box">

<lSabel for="adminName"> Select Mall Name </lSabel> 
 <select class="form-control" aria-label="Default select example" name="name">
<!--Mall Name :&nbsp;&nbsp;&nbsp;&nbsp;<select name="mallName" id="mallName" class="form-select">-->
<option selected>--Select Menu--</option>
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

<br>
<br>

<center>
<button type="submit" class="btn btn-outline-dark btn-lg px-4" value="">Submit</button> 
</center>

</div>
</form>

</body>
</html>