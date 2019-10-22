<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style>
dropbtn {
  background-color: #3498DB;
  color: white;
  padding: 16px;
  font-size: 16px;
  border: none;
  cursor: pointer;
}

.dropbtn:hover, .dropbtn:focus {
  background-color: #2980B9;
}

.dropdown {
  position: relative;
  display: inline-block;
}

.dropdown-content {
  display: none;
  position: absolute;
  background-color: #f1f1f1;
  min-width: 160px;
  overflow: auto;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
}

.dropdown-content a {
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
}

.dropdown a:hover {background-color: #ddd;}

.show {display: block;}
</style>
<title>Employee Management Screen</title>
</head>
<body>
	<div align="center">
		
		<h1>Employee List</h1>
		
		<a href="/displayAll/Page/0">Page</a>
	

		<table border="1">

			<th>Emp No</th>
			<th>Name</th>
			<th>Department</th>
			<th>Designation</th>
			<th>Basic</th>
 
			<c:forEach var="employee" items="${employeeList}">
				<tr>

					<td>${employee.empno}</td>
					<td>${employee.name}</td>
					<td>${employee.dept}</td>
					<td>${employee.desig}</td>
					<td>${employee.basic}</td>
				</tr>
			</c:forEach>
		</table>
		<br />
		<!--  
	<c:set var="num" value="${pages}"></c:set>
	<%
	int n=((Integer)pageContext.getAttribute("num")).intValue();
	for(int i=0;i<n;i++){
		%>	
		<a href="/displayAll/Page/<%=i%>"><%=i+1%></a>
		<% 
	}
	%>
	<a href="/">home</a><br/><br/>
	</div>
	-->
	<c:set var="num" value="${pages }"/>
<div class="dropdown" align="center">
<center>
  <button onclick="myFunction()" class="dropbtn">Dropdown</button>
  <div id="myDropdown" class="dropdown-content">
<%
int no=((Integer)pageContext.getAttribute("num")).intValue();
for(int i=0;i<no;i++){
%>
  <a href="/displayAll/Page/<%=i%>"><%=i+1 %></a>&nbsp;&nbsp;
 
               
<%
}
%>
</center>
</div>
<script type="text/javascript">
/* When the user clicks on the button,
toggle between hiding and showing the dropdown content */
function myFunction() {
  document.getElementById("myDropdown").classList.toggle("show");
}

// Close the dropdown if the user clicks outside of it
window.onclick = function(event) {
  if (!event.target.matches('.dropbtn')) {
    var dropdowns = document.getElementsByClassName("dropdown-content");
    var i;
    for (i = 0; i < dropdowns.length; i++) {
      var openDropdown = dropdowns[i];
      if (openDropdown.classList.contains('show')) {
        openDropdown.classList.remove('show');
      }
    }
  }
}
</script>

</body>
</html>