<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>

<a href="cart.app">Cart
</a>
</div>
<div align="center">
<h1> Book List</h1>
<table>
<tr>
<th>
Book name
</th>
<th>
Price
</th>
</tr>
<jstl:if test="${requestScope.count !=0 }">
</jstl:if>
<tr>
<td>${book.bookName}</td>
<td>${book.bookPrice }</td>
<td>
<a href=" home.jsp">Home</a>

</td>
</tr>


</table>
</div>
</body>
</html>