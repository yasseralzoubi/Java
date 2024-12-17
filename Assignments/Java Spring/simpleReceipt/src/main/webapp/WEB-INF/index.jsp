<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>
<label>Customer Name: <c:out value="${name}"/></label>
</h1>
<h2>
<label>Item Name : <c:out value="${itemName}"/></label>
</h2>
<h2>
<label>Price : <c:out value="${price}"/></label>
</h2>
<h2>
<label>Description : <c:out value="${description}"/></label>
</h2>
<h2>
<label>Vendor : <c:out value="${vendor}"/></label>
</h2>





</body>
</html>