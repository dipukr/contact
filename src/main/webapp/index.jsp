<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="ISO-8859-1" />
    <title>New</title>
    <style><%@include file="index.css" %></style>
  </head>
  <body>
    <div class="main">
      <h2>Create New Contact</h2>
      <form action="saveContact" method="post">
        <div class="inputBox">
          <input type="text" name="firstName" placeholder="First Name"/>
        </div>
        <div class="inputBox">
          <input type="text" name="lastName" placeholder="Last Name"/>
        </div>
        <div class="inputBox">
          <input type="text" name="phone" placeholder="Phone"/>
        </div>
        <div class="inputBox">
          <input type="text" name="email" placeholder="Email"/>
        </div>
        <input type="submit" value="Save" />
      </form>
    </div>
  </body>
</html>