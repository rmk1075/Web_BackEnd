<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	pageContext.setAttribute("p1", "value of page scope");
	request.setAttribute("r1", "value of request scope");
	session.setAttribute("s1", "value of session scope");
	application.setAttribute("a1", "value of application scope");
%>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
pageContext.getAttribute("p1"): <%=pageContext.getAttribute("p1") %><br>
pageContext.getAttribute("p1"): ${pageScope.p1}<br>
pageContext.getAttribute("p1"): ${p1}<br>
pageContext.getAttribute("r1"): <%=request.getAttribute("r1") %><br>
pageContext.getAttribute("r1"): ${requestScope.r1}<br>
pageContext.getAttribute("r1"): ${r1}<br>
pageContext.getAttribute("s1"): <%=session.getAttribute("s1") %><br>
pageContext.getAttribute("s1"): ${sessionScope.s1}<br>
pageContext.getAttribute("s1"): ${s1}<br>
pageContext.getAttribute("a1"): <%=application.getAttribute("a1") %><br>
pageContext.getAttribute("a1"): ${applicationScope.a1}<br>
pageContext.getAttribute("a1"): ${a1}<br>
</body>
</html>