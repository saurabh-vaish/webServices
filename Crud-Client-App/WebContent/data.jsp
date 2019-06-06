<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2>Welcome to Students Details page</h2>

	<table width=50% border=2>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Class</th>
			<th>Marks</th>
			<th>School</th>
			<th>Update</th>
			<th>Delete</th>
		</tr>

		<c:forEach items="${student}" var="s">
			<tr>
				<td><c:out value="${s.stuId}" /></td>
				<td><c:out value="${s.stuName}" /></td>
				<td><c:out value="${s.stuClass}" /></td>
				<td><c:out value="${s.stuMarks}" /></td>
				<td><c:out value="${s.stuSchool}" /></td>
				<td><a href="update.jsp?stuId=${s.stuId}">Update</a></td>
				<td><a href="delete?stuId=${s.stuId}">Delete</a></td>
			</tr>

		</c:forEach>

	</table>
<br><br>
	${msg} <br>

</body>
</html>