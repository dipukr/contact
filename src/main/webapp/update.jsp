<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="ISO-8859-1" />
    <title>Update</title>
    <style><%@include file="index.css" %></style>
  </head>
  <body>
    <div class="main">
      <h2>Update Contact</h2>
      <form action="/updateContact" method="post">
      	<div class="inputBox">
          <input type="text" name="id" value="${contact.id}" placeholder="Id" readonly/>
        </div>
        <div class="inputBox">
          <input type="text" name="firstName" value="${contact.firstName}" placeholder="First Name"/>
        </div>
        <div class="inputBox">
          <input type="text" name="lastName" value="${contact.lastName}" placeholder="Last Name"/>
        </div>
        <div class="inputBox">
          <input type="text" name="phone" value="${contact.phone}" placeholder="Phone"/>
        </div>
        <div class="inputBox">
          <input type="text" name="email" value="${contact.email}" placeholder="Email"/>
        </div>
        <input type="submit" value="Save" />
      </form>
    </div>
  </body>
</html>