<form action="${pageContext.request.contextPath}/product/create" method="POST">
    <p>
        ID:<br>
        <input type="text" name="id"
               value="${product.id}"
               <c:if test="${product != null}">readonly</c:if>
               required>
    </p>
    <p>
        Name:<br>
        <input type="text" name="name" value="${product.name}" required>
    </p>
    <p>
        Price:<br>
        <input type="number" name="price" value="${product.price}" required>
    </p>
    <button type="submit">Save Product</button>
    <a href="${pageContext.request.contextPath}/product/index">Cancel</a>
</form>