<%@ page import="java.util.Enumeration"%>
<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<html>
	<head>
		<title>request对象应用实例</title>
	</head>

	<body> 
		<%
			request.setAttribute("Name","小强");
			request.setAttribute("Password", "123456");
			request.setAttribute("Email", "x_zhaohu@163.com");
			request.removeAttribute("Password");
			Enumeration e = request.getAttributeNames();
			String attrName;
			while(e.hasMoreElements()) {
				attrName = e.nextElement().toString();
			//	out.print(attrName + "=" + request.getAttribute(attrName) + "<br />");
			}
			request.setCharacterEncoding("ISO-8859-1");
		%>
		<%=request.getCharacterEncoding() %>
		Content Length:<%=request.getContentLength()%> <br />
		Content Type: <%=request.getContentType()%> <br />
		<%=request.getContextPath()%>
		服务器地址:<%=request.getLocalAddr()%><br />
		服务器名称:<%=request.getLocalName()%><br />
		<%=request.getMethod()%>
		<%=request.getProtocol() %><br />
		客户端地址: <%=request.getRemoteAddr()%><br />
		客户端名称: <%=request.getRemoteHost()%><br />
		客户端端口: <%=request.getRemotePort()%><br />
		验证用户名: <%=request.getRemoteUser()%><br />
		请求URI:<%=request.getRequestURI()%><br />
		请求URL:<%=request.getRequestURL()%><br />
		服务器名字:<%=request.getServerName()%><br />
		服务器端口:<%=request.getServerPort()%><br />
		<%//在A页　用户访问,将其信息转发到B页。%>
	</body>
</html>
