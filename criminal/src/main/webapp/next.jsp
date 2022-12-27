<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

<title>Criminal Form</title>
<style>
body {
	text-align: center;
	padding-top: 15px;
	background-color: silver;
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
	padding: 8px;
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
      <img src="https://images.unsplash.com/photo-1589829545856-d10d557cf95f?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8NHx8Y3JpbWluYWwlMjBsYXd8ZW58MHx8MHx8&w=1000&q=80" alt="" width="100" height="100" class="d-inline-block align-text-top">
    </a>
 <h1 align="center">Criminal Details Form</h1>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo02" aria-controls="navbarTogglerDemo02" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarTogglerDemo02">
    <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
      
     </ul>
   <div>
   <a href="index.jsp" style="color:balck;">Home</a>
   </div>
  </div>
</nav> 


<h2 align="center">Criminal Detail</h2>


<form action="criminal" method="get">
Criminal Name : <input type="text" name="criminalName" id="criminalName"/>

Jail Name : <input type="text" name="jailName" id="jailName"/>

<input type="submit" value="Search" class="btn btn-dark"/>
</div>

<br>
<!--  <h4 class="text-danger">${message}</h4> -->
<br>
<br>
<div class="page">
<table class="table table-bordered table-striped">
  <thead class="thead-dark-50">
    <tr>
      <th scope="col">Id</th>
      <th scope="col">Image</th>
      <th scope="col">Criminal Name</th>
      <th scope="col">Crime</th>
      <th scope="col">TotalYearAwarded</th>
      <th scope="col">AliasName</th>
      <th scope="col">Description</th>
      <th scope="col">JailName</th>
      <th scope="col">FileName</th>
      <th scope="col">FileSize</th>
      <th scope="col">ContentType</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach items="${list}" var="entity">
    <tr>
      <th scope="row">${entity.id}</th>
      <td><img alt="Nothing" src="save/files/${entity.fileName}/?contentType=${entity.contentType}" width="100" height="150"> </td>
      <td>${entity.criminalName}</td>
      <td>${entity.crime}</td>
      <td>${entity.totalYearAwarded}</td>
      <td>${entity.aliasName}</td>
      <td>${entity.description}</td>
      <td>${entity.jailName}</td>
      <td>${entity.fileName}</td>
      <td>${entity.fileSize}</td>
      <td>${entity.contentType}</td>
    </tr>
    </c:forEach>
 </tbody> 
 </table> 
</div>

</form>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"
		integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js"
		integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF"
		crossorigin="anonymous"></script>

</body>
</html>