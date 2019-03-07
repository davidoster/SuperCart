<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dashboard - SuperCart</title>
    </head>

    <body>
        <h4>Select the products</h4>
        <p>Cart</p>
        <p class="cart"></p>
        
        <select class="product" name="products">
            <c:forEach items="${products}" var="item">
                <option value="<c:out value="${item.id}"/>"><c:out value="${item.name} - ${item.price} Euros"/></option>
            </c:forEach>
        </select>
        <button class="btn">Add</button>
            
        <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
        <script>
            let cart = document.querySelector(".cart");
            let btn = document.querySelector(".btn");
            
            btn.addEventListener("click",function() {
                let productValue = document.querySelector(".product").value;
                cart.innerHTML += " " + productValue;
            });
        </script>
    </body>
</html>
