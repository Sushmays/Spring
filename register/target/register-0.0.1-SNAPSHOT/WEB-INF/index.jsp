<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

<title>Register Form</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-light">
  <a class="navbar-brand" href="#">Navbar</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo02" aria-controls="navbarTogglerDemo02" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarTogglerDemo02">
    <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
      <li class="nav-item active">
        <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
      </li>
    </ul>
   <div>
		<a href="next.jsp" style="color:white;">Search</a>
		</div>
  </div>
</nav>

<h1>Patient Details</h1>
<p class="text-danger">${error}</p>
<form action="save" method="post">
Name  :<input type="text" name="name" value="${dto.name}"/> <br>
Email  :<input type="text" name="email" value="${dto.email}"/> <br>
Age  :<input type="number" name="age" value="${dto.age}"/> <br>
MobileNo  :<input type="number" name="mobileNo" value="${dto.mobileNo}"/> <br>
Gender  :<input  type="radio" name="gender" value="Male" value="${dto.gender}"/>  
		<label for="gender">Male</label>
		<input  type="radio" name="gender" value="Female" value="${dto.gender}"/> 
		<label for="gender">Female</label>
		<input  type="radio" name="gender" value="Others" value="${dto.gender}"/> 
		<label for="gender">Others</label><br>
Id-Proof  :<select name="idProof" value="${dto.idProof}">
<option>Aadhar Card</option>
<option>Pan Card</option>
<option>Voter-Id</option>
<option>Driving License</option>
<option>Passport</option>
</select><br>
Id-Value  :<input type="number" name="idValue" value="${dto.idValue}"/><br>
BPL Card  :<input  type="radio" name="BPLCard" value="Yes" value="${dto.BPLCard}"/>  
		<label for="BPLCard">Yes</label>
		<input  type="radio" name="BPLCard" value="No" value="${dto.BPLCard}"/>  
		<label for="BPLCard">No</label><br>
Insurance  :<input  type="radio" name="insurance" value="Yes" value="${dto.insurance}"/>  
		<label for="BPLCard">Yes</label>
		<input  type="radio" name="insurance" value="No" value="${dto.BPLCard}"/>  
		<label for="BPLCard">No</label><br>

<input type="submit" value="Save" class="btn btn-dark"/>

</form>

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

</body>
</html>