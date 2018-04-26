 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <c:set var="contextPath" value="${pageContext.request.contextPath}"/>
 <!DOCTYPE html>
<html lang="en">
<head>
  <title>Lease Manager</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="./css/bootstrap.min.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<nav class="navbar navbar-toggleable-md navbar-light bg-faded">
	<button class="navbar-toggler navbar-toggler-right" type="button"
		data-toggle="collapse" data-target="#navbarNavDropdown"
		aria-controls="navbarNavDropdown" aria-expanded="false"
		aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>
	<img src="./images/icon.jpg" alt="Logo" style="width:40px;">
	<a class="navbar-brand" href="#">Lease Manager</a>
	<div class="collapse navbar-collapse" id="navbarNavDropdown">
		<ul class="navbar-nav">
			<li class="nav-item active"><a class="nav-link" href="#">Home
					<span class="sr-only">(current)</span>
			</a></li>
			<li class="nav-item"><a class="nav-link" href="#">Features</a></li>
			<li class="nav-item"><a class="nav-link" href="#">Pricing</a></li>
			<li class="nav-item dropdown">
			 <a	class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" 
			 									 data-toggle="dropdown" 
			 									 aria-haspopup="true" aria-expanded="false">Property</a>
				<div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
					<a class="dropdown-item" href="#">Add Property</a>
					<a class="dropdown-item" href="#">List all Properties</a>					
					<a class="dropdown-item" href="#">Add Unit</a> 
				</div>
			</li>
		</ul>
	</div>
	</nav>
