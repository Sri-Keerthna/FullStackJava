<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
        <div align="center">
        <h3>Login</h3>
        <form:form action="authentication" modelAttribute="user" method="post" >
			<h1>Login Page</h1>
			<table border="1">
             <tr>
                <td>User ID</td>
                <td><form:input path="userid" /></td>
            </tr>
            <tr>
                <td>User Name</td>
                <td><form:input path="username" /></td>
            </tr>
            <tr>
                <td>Password</td>
                <td><form:input path="password" /></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" value="Save"></td>
            </tr>
			</table>
		</form:form>
	</div>
    </body>
</html>