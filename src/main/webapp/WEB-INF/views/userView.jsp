<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"
	import="com.springapps.entity.User,java.util.List,java.sql.*"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Signed-up Users</title>
</head>
<body>
<h2 style="text-align: center; margin-top: 2em;">Users</h2>
<%
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb", "root", "root");
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select * from users");
%>
<hr>
	<table border="1" style="float: left; margin: auto; width: 50%; padding: 10px">
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Date of sign-up</th>
			</tr>
			<% while (rs.next()){ %>
			<tr>
				<td><%= rs.getInt(1) %></td>
				<td><%=rs.getString(2)%></td>			
				<td><%=rs.getString(3)%></td>			
			</tr>
			<%} %>
		</table>
</body>
</html>