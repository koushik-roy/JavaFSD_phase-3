<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"
	import="com.springapps.entity.Product, java.util.List"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Portal</title>
<style>
	li{
		padding: 2px;
	}
</style>
</head>
<body>
	<h2 style="text-align: center; margin-top: 2em;">Welcome Admin!!!</h2>

	<table border="1"
		style="float: left; margin: auto; width: 50%; padding: 10px">
		<tr>
			<th>Id</th>
			<th>Product</th>
			<th>Price</th>
		</tr>
		<c:forEach items="${products}" var="product">
			<tr>
				<td>${product.id}</td>
				<td>${product.name}</td>
				<td>${product.price}</td>
			</tr>
		</c:forEach>
	</table>
	<hr>
	<div>
		<h4>List for signed-up users:</h4>
		<form action="<c:url value="/user" />" method="GET">
			<input type="submit" name="action" value="Users""/>
		</form>
		<hr>
		<h4>Categories:</h4>
		<ul>
			<li style="display: inline;">
				<form action="<c:url value="/trainingshoes" />" method="GET">
					<input type="submit" name="action" value="Training Shoes" />
				</form>
			</li>
			<li style="display: inline;">
				<form action="<c:url value="/runningshoes" />" method="GET">
					<input type="submit" name="action" value="Running Shoes" />
				</form>
			</li>
			<li style="display: inline;">
				<form action="<c:url value="/sneakers" />" method="GET">
					<input type="submit" name="action" value="Sneakers" />
				</form>
			</li>
		</ul>

	</div>

</body>
</html>