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
<style>

body {
	text-align: center;
	padding-top: 15px;
	background-size: 100%;
	background-position: center;
	background-repeat: no-repeat;
}
label {
	display: inline-block;
	width: 80px;
}
.page {
	padding: 8%;
}

</style>

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
  </div> 
   <div>
		<a href="index.jsp" style="color:balck;">Home</a>
		</div>
  </div>
</nav>

<h1>Patient Details</h1>
<div>
<p class="text-success">${message}</p>
</div>
<br>
<h2>Your Id :${dto.id}</h2>
</br>

<div class="page">
<table class="table table-bordered table-striped">
  <thead class="thead-dark-50">
    <tr>
      <th scope="col">Id</th>
      <th scope="col">Image</th>
      <th scope="col">Name</th>
      <th scope="col">Email</th>
      <th scope="col">Age</th>
      <th scope="col">MobileNo</th>
      <th scope="col">Gender</th>
      <th scope="col">Id-Proof</th>
      <th scope="col">Id-Value</th>
      <th scope="col">BPL-Card</th>
      <th scope="col">Insurance</th>
      <th scope="col">CreatedBy</th>
      <th scope="col">CreatedDateTime</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">1</th>
      <td><img alt="Nothing" src="save/files/${dto.fileName}" width="100" height="150"> </td>
      <td>${dto.name }</td>
      <td>${dto.email }</td>
      <td>${dto.age }</td>
      <td>${dto.mobileNo }</td>
      <td>${dto.gender }</td>
      <td>${dto.idProof }</td>
      <td>${dto.idValue }</td>
      <td>${dto.BPLCard }</td>
      <td>${dto.insurance }</td>
      <td>${dto.createdBy }</td>
      <td>${dto.createdDataTime }</td>
    </tr>
    </tbody>
    </table>
</div>

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

</body>
</html>