<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<h2>FormParam </h2>

<form action="rest/product/info" method="post">

<pre>
Id : <input type="text" name="id" >
Code : <input type="text" name="code" >
Cost : <input type="text" name="cost" >
Type : <input type="text" name="type" >

<input type="submit" value="Get Info" >
</pre>

</form>

</body>
</html>