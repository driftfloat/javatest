<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>user Access Count</title>
</head>
<body>
<%
Integer count = (Integer)session.getAttribute("count");
count = (count== null)?1:++count ;
session.setAttribute("count", count);
%>
Your count times:<%=count %>
</body>
</html>
