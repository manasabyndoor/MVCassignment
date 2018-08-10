<%@ page import="com.book.pojo.Book" %>
<%@ taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html>
<html>

<head>


<meta charset="ISO-8859-1">
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
<jstl:forEach var="book" items="${ requestScope.Book }"> 
<tr>
<td>${book.bookName}</td>
<td>${book.bookPrice }</td>
<td>
<a href="addtocart.app?bookName=${book.bookName}">Add to cart</a>

</td>
</tr>


</jstl:forEach>

</table>
</div>











</body>
</html>