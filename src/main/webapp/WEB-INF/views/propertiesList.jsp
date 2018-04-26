 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
 <c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<jsp:include page="header.jsp"/>
<body>
<div class="container">
<div class="row">
   <div class="col-lg-2">
   </div>
    <div class="col-lg-8">
		<table class="table table-striped">
		  <thead>
		    <tr>
		      <th scope="col">Property</th>
		      <th scope="col">Location</th>
		      <th scope="col">Owner</th>
		      <th scope="col">Type</th>
		      <th scope="col">Details</th>
		    </tr>
		  </thead>
		  <tbody>
		   <c:forEach var="property" items="${listOfProperty}">
		    <tr>
		      <td>${property.propertyName}</td>
		      <td>${property.state}, ${property.country}</td>
		      <td>${property.rentalOwner}</td>
		      <td>${property.propertyType}</td>
		      <td><a href="./propertyDetails/${property.propertyId}">Details</a></td>
		    </tr>
		    </c:forEach>
		  </tbody>
		</table>
    </div>
	 <div class="col-lg-2">
	 </div>
 </div>
</div>		
<jsp:include page="footer.jsp"/>