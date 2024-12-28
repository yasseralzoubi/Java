<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Burger Tracker</h1>
<table>
    <tr>
        <th>
            Burger Name
        </th>
        <th>
            Restaurant Name
        </th>
        <th>
            Rating (out of 5)
        </th>
    </tr>
        <c:forEach var="element" items="${burgers}">
    <tr>
        <td>${element.burgerName}</td>
        <td>${element.restaurantName}</td>
        <td>${element.rating}</td>
    </tr>
        </c:forEach>
</table>
    <form:form action="/create" method="post" modelAttribute="burger" >
        <p>
            <form:label path="burgerName">Burger Name </form:label>
            <form:errors path="burgerName"/>
            <form:input path="burgerName"/>
        </p>

        <p>
            <form:label path="restaurantName">Restaurant Name</form:label>
            <form:errors path="restaurantName"/>
            <form:input path="restaurantName"/>
        </p>

        <p>
            <form:label path="rating">Rating</form:label>
            <form:errors path="rating"/>
            <form:input path="rating"/>
        </p>

        <p>
            <form:label path="notes">Notes</form:label>
            <form:errors path="notes"/>
            <form:textarea path="notes"/>
        </p>

        <form:button type="submit">Submite</form:button>
    </form:form>



</body>
</html>
