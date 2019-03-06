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
    
        <select name="products">
            <c:forEach items="${products}" var="item">
             <option value="<c:out value="${item.id}"/>"><c:out value="${item.name} - ${item.price} Euros"/></option>
            </c:forEach>
        </select>
        
    </body>
</html>
