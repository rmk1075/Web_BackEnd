<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- <%
	request.setAttribute("n", 10);
%> --%>
<c:set var="n" scope="request" value="10"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:if test = "${n == 10}">
		test1<br>
	</c:if>
	<c:if test = "${n == 9}">
		test2<br>
	</c:if>
</body>
</html>