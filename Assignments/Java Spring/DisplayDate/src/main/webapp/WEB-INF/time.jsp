<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 12/18/2024
  Time: 3:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <title>Time</title>
    <script type="text/javascript" src="/js/timeAlert.js"></script>
    <link rel="stylesheet" type="text/css" href="/CSS/style.css">
</head>
<body>
<%
    java.text.DateFormat timeFormat = new java.text.SimpleDateFormat("hh:mm a");
%>
<h1><%= timeFormat.format(new java.util.Date()) %></h1>



</body>
</html>
