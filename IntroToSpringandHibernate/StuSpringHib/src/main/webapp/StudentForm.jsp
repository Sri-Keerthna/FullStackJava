<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@taglib uri="http://www.springframework.org/tags/form" prefix="SpringForm" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
        <h1>New/Edit Student</h1>
        <form:form action="saveStudent" method="post" modelAttribute="employee">
        <table>
        <form:hidden path="id"/>
        <!-- removing this bcz we need to show this to user
            <form:hidden path="id"/>
             available in model attribute but not showing in UI -->
           
            <tr>
                <td>RollNo:</td>
                <td><form:input path="rollno" /></td>
            </tr>
           
            <tr>
                <td>Name:</td>
                <td><form:input path="name" /></td>
            </tr>
            
            <tr>
                <td>Age:</td>
                <td><form:input path="age" /></td>
            </tr>
            
            <tr>
                <td>Gender:</td>
                <td><form:input path="gender" /></td>
            </tr>
            
            <tr>
                <td colspan="2" align="center"><input type="submit" value="Save"></td>
            </tr>
        </table>
        </form:form>
    </div>
</body>
</html>