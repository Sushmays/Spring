<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

<title>Register Form</title>
<style>
body {
	text-align: center;
	padding-top: 15px;
}
label {
	display: inline-block;
	width: 80px;
}
.register-box {
	position: absolute;
	top: 60%;
	left: 50%;
	width: 400px;
	padding: 40px;
	transform: translate(-50%, -50%);
	background: white;
	box-shadow: 0 15px 25px rgba(143, 124, 236, 0.7);
	border-radius: 10px;
}
</style>
</head>

<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
 <a class="navbar-brand" href="#">
      <img src="https://media.istockphoto.com/id/1181534622/vector/caduceus-design.jpg?b=1&s=612x612&w=0&k=20&c=ZgLprVkktnrivBWrtGLODHgYaVk2btOueferJwmKCHI=" alt="" width="75" height="75" class="d-inline-block align-text-top">
    </a>
 <h1 align="center">Hospital Registration Form</h1>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo02" aria-controls="navbarTogglerDemo02" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarTogglerDemo02">
    <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
      
     </ul>
   <div>
   <a href="next.jsp" style="color:balck;">Search</a>
   </div>
  </div>
</nav> 
  

<h2 align="center">Patient Detail</h2>
<p class="text-danger">${error}</p>
  
  <form  action="save" method="post" enctype="multipart/form-data">
  <div class="register-box">
  <div>
  <label for="name">Name :</label>
  <input type="text" id="name" name="name"/> 
</div>

<div>
<label for="email">Email :</label>
<input type="text" name="email" id="email"/> 
</div>

<div>
<label for="age">Age :</label>
<input type="number" name="age" id="age"/> 
</div>

<div>
<label for="mobileNo">MobileNo :</label>
<input type="tel" name="mobileNo" id="mobileNo"/> 
</div>

<div>
<label>Gender:</label>
<input type="radio" name="gender" value="male"> Male
<input type="radio" name="gender" value="female"> Female
<input type="radio" name="gender" value="unknown"> Unknown

</div>	
<div>
Id-Proof :&nbsp&nbsp&nbsp&nbsp<select name="idProof" class="form-select">
<option>--Select--</option>
<option>Aadhar Card</option>
<option>Pan Card</option>
<option>Voter-Id</option>
<option>Driving License</option>
<option>Passport</option>
</select>
</div>
<br>

<div>
<label for="idValue">Id-Value :</label>
<input type="text" name="idValue" id="idValue"/>
</div>

<div>
<label for="BPLCard">BPL-Card :</label>
<input  type="radio" name="BPLCard" value="Yes"/>  
		<label for="BPLCard">Yes</label>
		<input  type="radio" name="BPLCard" value="No"/>  
		<label for="BPLCard">No</label>
		</div>
		<div>
<label for="insurance" >Insurance :</label>		
<input  type="radio" name="insurance" value="Yes"/>  
		<label for="BPLCard">Yes</label>
		<input  type="radio" name="insurance" value="No"/>  
		<label for="BPLCard">No</label>
		</div>
		
<div>
<label for="image">Image :</label>		
<input type="file" name="image" id="image"/> <br>
</div>

<button type="submit" class="btn btn-dark">Save</button>
</div>
</form>
 
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

</body>
</html>