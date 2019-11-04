<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script>
function js(){
	
	if(document.getElementById("qty").value == 0){
		alert("please enter the quantity required");
	} else {
		document.getElementById("myForm").submit();
	}
}
</script>
</head>
<body>
<div align="center">
 <table border="1">
 	<tr>
 		<td>Product Name</td>
 		<td>Price</td>
 		<td>brokerage</td>
 		<td>Quantity Required</td>
 		<td>Quantity Available</td>
 		<td>buy stock</td>
 	</tr>
 	
 		<c:forEach var="list" items="${list}">
 		 <form:form action="/userBuy/" method="get" modelAttribute="stock" id="myForm">
 		
				<tr>
 					<form:hidden path="stockId" value="${list.stockId }"/>
					<td><form:input path="name" value="${list.name}" readonly="readonly"/> </td>
					
					<td><form:input path="price" value="${list.price}" readonly="readonly"/></td>
					<td><form:input path="brokerage" value="${list.brokerage}" readonly="readonly"/></td>
					<td><form:input path="quantity" id="qty"/></td>
					<td><form:input path="quantity" value="${list.quantity}" readonly="readonly"/></td>
					<td> <input type="button" value="Buy" onclick="js()"></td>
				</tr> 
				</form:form>
			</c:forEach>	
 </table>
 <br><br><a>${msg }</a>

</div>
</body>
</html>