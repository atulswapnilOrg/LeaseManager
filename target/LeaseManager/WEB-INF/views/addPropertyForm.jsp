 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
 <c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<jsp:include page="header.jsp"/>
<div class="container-fluid">
	<form>
	 	<div class="form-group">
		    <label for="propertyName">Property Name</label>
		    <input type="text" class="form-control" id="propertyName" placeholder="Enter property name.">
	 	 </div>
	 	 <div class="form-group">
		    <label for="propertyType">Property Type</label>
		    <select class="form-control" id="propertyType">
		    	  <option>Select</option>
			      <option>Residential</option>
			      <option>Commercial</option>
	    	</select>
	 	 </div>
	 	  <div class="form-group">
		    <label for="propertySubType">Property Type</label>
		    <select class="form-control" id="propertySubType">
			      <option>Select</option>
	    	</select>
	 	 </div>
	 	 <div class="form-group">
		    <label for="numberOfUnits">Number of Units</label>
		   <input type="text" class="form-control" id="numberOfUnits" placeholder="units">
	 	 </div>
	 	<hr/>
	 	 <div class="form-group">
		    <label for="rentalOwner">Rental Owner (Optional)</label>
		   <input type="text" class="form-control" id="rentalOwner" placeholder="Enter Owner">
	 	 </div>
	 	 <div class="form-group">
		    <label for="operatingAccount">Operating Account</label>
		   <input type="text" class="form-control" id="operatingAccount" placeholder="Enter Operating Account">
	 	 </div>
	 	 <div class="form-group">
		    <label for="propertyReserve">Property Reserve</label>
		   <input type="text" class="form-control" id="operatingAccount" placeholder="Enter Property Reserve">
	 	 </div>
	 	<hr/>
	 	 <div class="form-group">
		    <label for="street">Street</label>
		   <input type="text" class="form-control" id="street" placeholder="Enter Street.">
	 	 </div>
	 	  <div class="form-group">
		    <label for="city">Street</label>
		   <input type="text" class="form-control" id="street" placeholder="Enter City.">
	 	 </div>
	 	  <div class="form-group">
		    <label for="country">Country</label>
		     <select class="form-control" id="country">
			      <option>Select Country</option>
	    	</select>
	 	 </div>
	 	  <div class="form-group">
		    <label for="state">State</label>
		     <select class="form-control" id="state">
			      <option>Select State</option>
	    	</select>
	 	 </div>
	 	 <button type="submit" class="btn btn-primary">Submit</button>
	</form>
	
</div>
<jsp:include page="footer.jsp"/>

