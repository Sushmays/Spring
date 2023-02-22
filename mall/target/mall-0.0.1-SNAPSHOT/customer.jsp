<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

<title>Mall</title>

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
<br><br>
<center>
<h3 style="color: green;">Admin Module: Person from mall can login and add customer information</h3>
</center>

<br><br><br>
<div>
<table class="table table-bordered table-striped">
  <thead class="thead-dark-50">
    <tr>
      <th scope="col">Id</th>
      <th scope="col">Mall Name</th>
      <th scope="col">Admin Name</th>
      <th scope="col">Password</th>
      <th scope="col">Active</th>
      <th scope="col">Account Locked</th>
      <th scope="col">No_Of_Wrong_Attempts</th>
      <th scope="col">Mall Email</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach items="${list}" var="entity">
    <tr>
      <th scope="row">${entity.id}</th>
      <td>${entity.mallName}</td>
      <td>${entity.adminName}</td>
      <td>${entity.password}</td>
      <td>${entity.active}</td>
      <td>${entity.accountLocked}</td>
      <td>${entity.noOfWrongAttempts}</td>
      <td>${entity.mallEmail}</td>
    </tr>
    </c:forEach>
 </tbody> 
 </table> 
</div>



<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

</body>
</html>