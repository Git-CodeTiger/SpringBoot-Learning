<%@ page contentType="text/html" pageEncoding="utf-8" %>
<html>
	<head>
		<title>数据处理</title>
	</head>

	<body>
		<%
			String userName = request.getParameter("username");
			String password = request.getParameter("password");
		%>
		<jsp:forward page="http://127.0.0.1:8080/SpringMVCDemo/xxx">
			<jsp:param name="userPassword" value="<%=password%>" />
		</jsp:forward>

	</body>
</html>
