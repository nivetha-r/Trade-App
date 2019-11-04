<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
 <table border="1">
 	<tr>
 		<td>Product Name</td>
 		<td>Quantity Available</td>
 		<td>Price</td>
 		<td>brokerage</td>
 		<td>buy stock</td>
 	</tr>
 	<tr>
 		<c:forEach var="list" items="${list}">
				<tr>

					<td>${list.name}</td>
					<td>${list.qty}</td>
					<td>${list.price}</td>
					<td>${list.brokerage}%</td>
					
					<td><a href="/userBuy/${list.stockid}"><input type="button" value="Buy" /></a></td>
				</tr> 
			</c:forEach>	
 </table>
</div>
</body>
</html>