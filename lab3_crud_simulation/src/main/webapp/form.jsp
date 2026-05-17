<form action="${pageContext.request.contextPath}/product/${product != null ? 'edit' : 'create'}" method="POST">
    <p>
        ID:<br>
        <input type="text" name="id" value="${product.id}" required>
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
</form>
