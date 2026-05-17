<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <head>
        <title>Products</title>
        <style>
            table, th, td {
                border: 1px solid black;
            }
        </style>
    </head>
    <body>
        <h2>Product Management</h2>
        <a href="${pageContext.request.contextPath}/product/create">+ Add New Product</a>
        <br><br>
        <table>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Price</th>
                <th>Actions</th>
            </tr>
            <c:forEach var="p" items="${items}">
                <tr>
                    <td>${p.id}</td>
                    <td>${p.name}</td>
                    <td>${p.price}</td>
                    <td>
                        <a href="${pageContext.request.contextPath}/product/edit/${p.id}">Edit</a>
                        <a href="${pageContext.request.contextPath}/product/delete/${p.id}"
                        onclick="return confirm('Are you sure?')">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>