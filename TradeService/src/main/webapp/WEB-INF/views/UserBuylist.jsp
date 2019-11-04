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
 		<td>Quantity</td>
 		<td>Price</td>
 		<td>brokerage</td>
 		<td>Gross Price</td>
 	</tr>
 	<tr>
 		<c:forEach var="list" items="${list}">
				<tr>

					<td>${list.stockname}</td>
					<td>${list.qty}</td>
					<td>${list.price}</td>
					<td>${list.brokerage}%</td>
					<td>${list.totalprice}</td>
				</tr> 
			</c:forEach>	
 </table>
 <a>${msg }</a><br><br>
<a href="/stockList/"><input type="button" value="Buy Stock" /> </a><br><br>
<a href="/"><input type="button" value="Change User" /></a>
</div>
</body>
</html>