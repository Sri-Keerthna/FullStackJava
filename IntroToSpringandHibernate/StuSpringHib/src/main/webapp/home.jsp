<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body>
	<div align="center">
		<h1>Student List</h1>
		
		<table border="1">

			<th>RollNo</th>
			<th>Name</th>
			<th>Age</th>
			<th>Gender</th>
			<th>Action</th>

			<c:forEach var="student" items="${listStudent}">
				<tr>
					<td>${student.rollno}</td>
					<td>${student.sname}</td>
					<td>${student.age}</td>
					<td>${student.gender}</td>

					<td><a href="editStudent?id=${student.id}">Edit</a>
					 <!--editStudent will goes to controller and "id" is the req mapping parameter -->
						&nbsp;&nbsp;&nbsp;&nbsp; <a
						href="deleteStudent?id=${student.id}">Delete</a></td>

				</tr>
			</c:forEach>
		</table>
		<h4>
			New Employee Register <a href="newStudent">here</a> 
			<!--  newStudent is the req mapping name -->
		</h4>
	</div>
</body>
</html>