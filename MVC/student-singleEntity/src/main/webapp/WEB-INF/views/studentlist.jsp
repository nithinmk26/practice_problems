<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<body>
	<div align="center">

		<table border=0.5 px solid black>
			<thead>
				<tr>
					<td>Student ID</td>
					<td>Student Name</td>
					<td>Student Marks</td>
					<td>Student Address</td>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="emp" items="${employeeName}">
					<tr>
						<td>${emp.id}</td>
						<td>${emp.name}</td>
						<td>${emp.marks}</td>
						<td>${emp.address}</td>
					</tr>
				</c:forEach>
			</tbody>

		</table>


	</div>
</body>


</html>