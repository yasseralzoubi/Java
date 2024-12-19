<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 12/18/2024
  Time: 3:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.util.Date"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Date</title>
    <script type="text/javascript" src="/js/dateAlert.js"></script>
    <link rel="stylesheet" type="text/css" href="/CSS/style.css">
</head>
<body>
    <%java.text.DateFormat df = new java.text.SimpleDateFormat("EEEE,MMM dd,yyyy"); %>
    <h1><%= df.format(new java.util.Date()) %> </h1>
</body>
</html>
