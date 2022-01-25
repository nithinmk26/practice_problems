<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>EMployee JSP</title>
</head>
<body>
	<div>
		<h2>Student</h2>
		<form action="insertStudent" method="post" name="registration">
			<div>
				<label for="name">Student Name</label> <input type="text"
					placeholder="Enter Student Name"
					name="name">
			</div>
				<div>
				<label for="marks">Student Marks</label> <input type="text"
					placeholder="Enter Student Marks"
					name="marks">
			</div>
			<div>
				<label for="address">Student address</label> <input type="text"
					placeholder="Enter Student address"
					name="address">
			</div>
		<!-- 	<div class="form-group">
				<label for="company">Company</label> <select name="companyId">
					<c:forEach var="task" items="${companies}">
						<option value="${task.companyId}">${task.companyName}</option>
					</c:forEach>
				</select>
			</div>  -->
			<button type="submit">Submit</button>
			<a href="/" >GoBack</a>
		</form>
	</div>
</body>
</html>