<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
   <a href="next.jsp" style="color:balck;">Search</a>
   </div>
  </div>
</nav> 


<h2 align="center">Criminal Detail</h2>

<h4 class="text-success">${message}</h4>
<h4 class="text-danger">${error}</h4>


<form action="criminal" method="post" enctype="multipart/form-data">
<div class="register-box">
<div>

<div class="item">
<label for="criminalName">Criminal Name<span class="required" style="color:red;" >*</span> :</label>
<input type="text" name="criminalName" required="" id="criminalName"/>
</div>
<br>
<div>
<label for="crime">Crime<span class="required" style="color:red;" >*</span> :</label>
<select name="crime" required="" class="form-select">
<option>--Select--</option>
<option>Violent Crimes</option>
<option>Property Crimes</option>
<option>Illigal drug trade</option>
<option>Organized crime</option>
<option>Rape</option>
</select>
</div>

<div>
<label for="totalYearAwarded">Total Year Awarded<span class="required" style="color:red;" >*</span> :</label>
<input type="number" name="totalYearAwarded" required="" id="totalYearAwarded"/>
</div>

<div>
<label for="aliasName">Alias Name :</label>
<input type="text" name="aliasName" id="aliasName"/>
</div>

<div>
<label for="description">Description<span class="required" style="color:red;" >*</span> :</label>
&nbsp&nbsp&nbsp&nbsp<textarea name="description" required='' id="description" rows="3" cols="20"></textarea>

</div>
<br>
<div>
<label for="jailName">Jail Name :</label>
<input type="text" name="jailName" id="jailName"/>
</div>
<br>

<label for="image">Image :</label>
<input type="file" name="image" id="image"/>

<br>
<button type="submit" class="btn btn-dark">Save</button>
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