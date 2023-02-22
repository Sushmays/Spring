<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search feedBack</title>
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

<form action="feedback" method="post">
<div style="padding-left: 75%; padding-top: 0.8%">

<label>Name</label><input type="text" name="name" /> <input class="btn" type="submit" value="feedback" role="button"/>
</div>
<c:if test="${not empty list}">
<table class="table table-sm">
  <thead>
    <tr>
      <th scope="col">Id</th>
      <th scope="col">Purpose</th>
      <th scope="col">Ambience</th>
      <th scope="col">VisitedFoodCourt</th>
      <th scope="col">VisitedRestRoom</th>
      <th scope="col">ParkingExperience</th>
      <th scope="col">TotalExperience</th>
      <th scope="col">FeedBack</th>
    </tr>   
  </thead>
  <tbody>
  <c:forEach items="${list}" var="entity">
    <tr>
      <th scope="row">${entity.feedback_id}</th>
      <td>${entity.purpose}</td>
      <td>${entity.ambience}</td>
      <td>${entity.visitedFoodCourt}</td>
      <td>${entity.visitedRestRoom}</td>
      <td>${entity.parkingExperience}</td>
      <td>${entity.totalExperience}</td>
      <td>${entity.feedBack}</td>
    </tr>
    </c:forEach>
    </tbody>
</table>
</c:if>
</form>

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>


</body>
</html>