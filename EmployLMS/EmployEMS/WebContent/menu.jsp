<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
*
.flex-container{
display: flex;
}
.flex-container>div{
margin:10px;
padding:20px;
font-size:20px;
background-color:pink;
}
.flex-container>div1{
margin:10px;
padding:20px;
font-size:20px;
width:100%;
display:flex;
flex-direction:column;
background-color:pink;
}
.flex-container>div2{
margin:10px;
padding:20px;
font-size:20px;
width:100%;
display:flex;
flex-direction:column;
background-color:pink;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1><b>Employee Dashboard : Sections</b></h1>
<div class="flex-container">
<div>
<jsp:include page="MyDetails.jsp"/>
</div>
<div>
<jsp:include page="MyManager.jsp"/> 
</div>
</div>

<div1 class="flex-container">
<div1>
<a href="MyLeave.jsp">My Leave Applications Section</a>
</div1>
</div1>

<div2 class="flex-container">
<div2>
<a href="EmployPendingLeave.jsp">My Reporting Employee's Pending Leave Applications Section</a>
</div2>
</div2>
</body>
</html>