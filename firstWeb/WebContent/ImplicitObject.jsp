<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	// request & out are implicit object of jsp
	StringBuffer url = request.getRequestURL();
	out.print("url: " + url.toString());
	out.print("<br>");
%>
</body>
</html>