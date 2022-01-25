<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>

<body>
<form action="findStudent" method="get">

<label for="Student ID"></label><input type="text" placeholder="Enter Student ID"
					name="id"></input>
<button type="submit">FETCH</button></br>
<button><a href="/">HOME PAGE</a></button>

</form>
</body>
</html>