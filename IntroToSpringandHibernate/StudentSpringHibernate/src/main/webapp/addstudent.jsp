<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="/addstudent">
Roll Number :
<input type="text" name="rollno"/><br/><br/>
Student Name :
<input type="text" name="sname"/><br/><br/>
Age :
<input type="text" name="age"/><br/><br/>
Gender :
<input type="radio" name="gender" value="Male">Male</input>
<input type="radio" name="gender" value="Female">Female</input><br/><br/>
Country :
<select name="country"><br/><br/>
<option type="India">India</option>
<option type="America">America</option>
<option type="SriLanka">SriLanka</option>
</select><br/><br/>
Date Of Join :
<input type="date" name="doj"/><br/><br/>
Final Score :
<input type="text" name="finalscore"/><br/><br/>
<input type="submit" value="Submit"/><br/><br/>
</form>
</body>
</html>