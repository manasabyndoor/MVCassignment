<%@ page import="com.book.pojo.Book" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head><% Book book=(Book)request.getAttribute("Book"); %>


<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="BookServlet" method="get">
Id<input type="text" name="id">
Name<input type="text" value="name">
<input type="submit" name="add" value="add">
</form>
</body>
</html>