<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

<title>Mall</title>
<link rel="icon" type="image/x-icon" href="https://www.freeiconspng.com/thumbs/success-icon/success-icon-19.png">
<style type="text/css">

.log{
position: absolute;
text-align: center;
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
       <a href="admin.jsp" class="btn btn-outline-black" type="submit">Home</a>
    </form>
  </div> 
</nav>
<br><br><br><br><br><br><br><br>
<!--  <form action="mall" method="post">-->

<form action="login" method="get">
<section class="vh-300 gradient-custom">
<div class="container py-9 h-300">
<div class="row d-flex justify-content-center align-items-center h-300">
<div class="col-12 col-md-8 col-lg-6 col-xl-5">
<div class="card bg-dark text-white" style="border-radius: 1rem;">
<div class="card-body p-8 text-left">

<div class="md-md-5 mt-md-4 pb-5">
<div class="fw-bold mb-2 text-uppercase">
<p class="text-white-50 mb-5"></p>

<div class="form-outline form-white mb-4">
<p class="btn btn-light btn-lg px-5">Mall Name : ${entity.name}</p>
<p class="btn btn-light btn-lg px-5">Admin Name : ${entity.adminName}</p>
</div>

<div class="log"> 
<button class="btn btn-outline-light px-4" type="submit" value="login"><a href="customerDetail.jsp">Customer FeedBack</a></button>
<button class="btn btn-outline-light px-4" type="submit" value="login"><a href="feedBack.jsp">Search FeedBack</a></button>
</div>

</div>
</div>
</div>
</div>
</div>
</div>
</div>
</section>
</form>


<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

</body>
</html>