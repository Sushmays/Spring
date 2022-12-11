<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Chappal</title>
</head>
<body>

	<nav class="navbar navbar-expand-lg navbar-dark bg-info">
		<a class="navbar-brand" href="#"></a> <img
			src="https://raw.githubusercontent.com/X-workzDev01/xworkzwebsite/master/src/main/webapp/assets/images/Logo.png"
			width="100" height="50" alt="">
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNavAltMarkup">
			<div class="navbar-nav">
				<a class="nav-item nav-link active" href="#">Home <span
					class="sr-only">(current)</span></a>
			</div>
		</div>
	</nav>

	<h1>Chappal Details</h1>
	<p class="text-success">${message}</p>
	<p class="text-danger">${error}</p>

	<form action="chapal" method="post">
		<h3>
			<pre>
Brand <input type="text" name="brand"  ${dto.brand}/><br>
Color 	<select name="color" ${dto.color}>
<option>---Select Color---</option>
<option>Black</option>
<option>Red-Black</option>
<option>Pink</option>
<option>White</option>
<option>Gold</option>
<option>Grey</option>
<option>Brown</option>
<option>Blue</option>
</select><br>
Size 	<select name="size" ${dto.size}>
<option>---Select Size---</option>
<option>32</option>
<option>34</option>
<option>36</option>
<option>38</option>
<option>40</option>
<option>42</option>
<option>46</option>
<option>50</option>
</select><br> 
Gender	:
		<input  type="radio" name="gender" value="Male" ${dto.gender}/>  
		<label for="gender">Male</label>
		<input  type="radio" name="gender" value="Female" ${dto.gender}/> 
		<label for="gender">Female</label>
		<input  type="radio" name="gender" value="Others" ${dto.gender}/> 
		<label for="gender">Others</label><br>
Price <input type="number" name="price"  ${dto.price}/><br>

<input type="submit" value="Save" class="btn btn-dark"/>
</pre>

		</h3>

	</form>


	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>


</body>
</html>