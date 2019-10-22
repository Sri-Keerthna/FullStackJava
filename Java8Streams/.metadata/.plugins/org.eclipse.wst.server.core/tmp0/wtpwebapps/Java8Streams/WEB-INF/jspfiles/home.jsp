<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
   <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Employee Management Screen</title>
</head>
<body>
	<div align="center">
		<h1>Employee List</h1><br/>
		<form:form method="post" action="search" modelAttribute="searchEmployee">
		Name :
		<form:input path="empName"/>&nbsp;&nbsp;
		Employee Band :
		<form:select path="band">
		<form:option value='0'>-SELECT-</form:option>
		<form:option value='M'>Manager</form:option>
		<form:option value='E'>Employee</form:option>
		<form:option value='C'>Contractor</form:option>
		</form:select>
		Salary ;
		<form:input path="salary"/>
		<input type="submit" value="Search"/><br/><br/>
		</form:form>
		<h2>No of Employees : ${listEmployee.size()}</h2>
		
		<table border="1">

			<th>Name</th>
			<th>Salary</th>
			<th>Band</th>
			<th>DOJ</th>

			<c:forEach var="employee" items="${listEmployee}">
				<tr>
					<td>${employee.empName}</td>
					<td>${employee.salary}</td>
					<td>${employee.band}</td>
					<td>${employee.doj}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>