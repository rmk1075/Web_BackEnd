<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%--
	jsp comment
 --%>
<!-- 
	html comment
 -->
<%
	// java comment1
	/*
		java comment2
	*/
	for(int i = 1; i < 6; i++) {
%>
	
	<h<%=i%>>text</h<%=i%>>
	
<%
	}
%>
</body>
</html>