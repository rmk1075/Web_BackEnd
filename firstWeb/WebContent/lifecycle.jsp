<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
hello
<%
	System.out.println("service");
%>

<%!
	public void jspInit() {
		System.out.println("init");
	}

	public void jspDestroy() {
		System.out.println("destroy");
	}
%>
</body>
</html>