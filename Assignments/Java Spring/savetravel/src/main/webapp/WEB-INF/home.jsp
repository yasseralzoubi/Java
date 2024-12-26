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
    <title>Expenses</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
</head>
<body>
<h1>Save Travels</h1>
<table class="table text-center align-middle">
    <tr>
        <th>Expenses</th>
        <th>Vendor</th>
        <th>Amount</th>
        <th>Actions</th>
    </tr>
        <c:forEach var="element" items="${expenses}">
    <tr>
        <td><a href="/expense/${element.id}">${element.name}</a></td>
        <td>${element.vendor}</td>
        <td>${element.amount}</td>
        <td><a href="/edit/${element.id}">edit</a></td>
        <td>
            <form:form action="/delete/{id}" method="post" modelAttribute="expense">
                <form:hidden path="id" value="${element.id}"/>
                <input type="submit" value="Delete" class="btn btn-primary" >
            </form:form>
        </td>
    </tr>
         </c:forEach>
</table>
    <form:form action="/create" method="post" modelAttribute="expense">
        <p class="h1">
            <form:label path="name">Expense Name: </form:label>
            <form:errors path="name"/>
            <form:input path="name"/>
        </p>
        <p class="h1">
            <form:label path="vendor">vendor: </form:label>
            <form:errors path="vendor"/>
            <form:input path="vendor"/>
        </p>
        <p class="h1">
            <form:label path="amount">amount: </form:label>
            <form:errors path="amount"/>
            <form:input path="amount"/>
        </p>
        <p class="h1">
            <form:label path="description">description: </form:label>
            <form:errors path="description"/>
            <form:textarea path="description"/>
        </p class="h1">
        <form:button class="btn btn-primary" type="submit">Submit</form:button>
    </form:form>


</body>
</html>
