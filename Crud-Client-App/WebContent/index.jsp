<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	isELIgnored="false"
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to student registration page</h1>

	<form action="register" method="post">
		<pre>
Student Id     : <input type="text" name="sid">
Student Name   : <input type="text" name="sname">
Student Class  : <select name="sclass">
					<option value="">-SELECT-</option>
					<option value="MCA">MCA</option>
					<option value="B.TECH">B.TECH</option>
					<option value="M.A.">M.A.</option>
				</select>
Student Marks  : <input type="text" name="smarks">
Student School : <input type="text" name="sschool">
<input type="submit" value="Register">

</pre>

</form>

${msg}
<br><br>
View All records : <a href="view">View</a>

</body>
</html>