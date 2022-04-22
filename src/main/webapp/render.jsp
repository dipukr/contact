<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html> 
<head>
<meta charset="ISO-8859-1">
<title>Contacts</title>
<style><%@ include file="render.css" %></style>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>Id</th>
				<th>First</th>
				<th>Last</th>
				<th>Phone</th>
				<th>Email</th>
				<th>Delete</th>
				<th>Update</th>
			</tr>
		</thead>
		<c:forEach var="contact" items="${contacts}">
			<tbody>
				<tr>
					<td>${contact.id}</td>
					<td>${contact.firstName}</td>
					<td>${contact.lastName}</td>
					<td>${contact.phone}</td>
					<td>${contact.email}</td>
					<td><a href="delete?id=${contact.id}">Delete</a></td>
					<td><a href="update?id=${contact.id}">Update</a></td>
				</tr>
			</tbody>
		</c:forEach>
	</table>
</body>
</html>