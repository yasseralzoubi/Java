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
    <title>Edit Expense</title>
</head>
<body>
<h1>Edit Expense</h1>
<form:form action="/update/${expense.id}" method="put" modelAttribute="exp">
    <p>
        <form:label path="name">Expense Name: </form:label>
        <form:errors path="name"/>
        <form:input path="name" value="${expense.name}" />
    </p>
    <p>
        <form:label path="vendor">vendor: </form:label>
        <form:errors path="vendor"/>
        <form:input path="vendor" value="${expense.vendor}"/>
    </p>
    <p>
        <form:label path="amount">amount: </form:label>
        <form:errors path="amount"/>
        <form:input path="amount" value="${expense.amount}"/>
    </p>
    <p>
        <form:label path="description">description: </form:label>
        <form:errors path="description"/>
        <form:textarea path="description" value="${expense.description}"/>
    </p>
    <form:button class="btn btn-primary">Submit</form:button >
</form:form>



</body>
</html>
