<%--
  Created by IntelliJ IDEA.
  User: Yomna Elsayed
  Date: 6/11/2024
  Time: 11:10 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Product Manager - Products</title>
</head>
<body>
<h1>Products</h1>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Price</th>
        <th>Quantity</th>

    </tr>
    <c:forEach items="${products}" var="product">
        <tr>
            <td>${product.productId}</td>
            <td>${product.productName}</td>
            <td>${product.productPrice}</td>
            <td>${product.productQuantity}</td>

        </tr>
    </c:forEach>
</table>

<button><a href="index.jsp">Add new Product</a>
</button>


</body>
</html>
