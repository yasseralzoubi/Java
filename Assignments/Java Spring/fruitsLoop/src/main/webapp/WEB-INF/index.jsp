<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 12/19/2024
  Time: 1:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.util.Date"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">


<html>
<head>
    <title>Title</title>
</head>
<body>
<h1 >Fruit Store</h1>
<table class="table table-striped">
    <thead>
    <tr>
        <th >Name</th>
        <th >Price</th>
    </tr>
    </thead>
    <tbody>
        <c:forEach var="oneFruit" items="${addFruits}">
           <tr>
               <td >${oneFruit.name}</td>
               <td >${oneFruit.price}</td>
           </tr>
        </c:forEach>
    </tbody>
</table>


</body>
</html>
