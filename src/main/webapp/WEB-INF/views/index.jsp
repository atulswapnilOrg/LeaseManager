 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<jsp:include page="header.jsp"/>
<h2>Hello World!</h2>
<p><a href="./properties">Properties</a>
<p><a href="./getAddNewPropertyForm">Add New Property</a>
<jsp:include page="footer.jsp"/>
