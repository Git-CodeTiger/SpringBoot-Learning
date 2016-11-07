<%@ page contentType="text/html" pageEncoding="utf-8" %>
<html>
	<head>
		<meta charset="utf-8" />
		<title>用户登陆页面</title>
	</head>

	<body align="center" style="margin: 200px">
		<div width="90%"> 
			<h2>用户登陆页面</h2>
			<form action="requestData" method="GET">
				用户名:<input type="text" name="username" /> <br />
				密码:<input type="password" name="password" /><br />
				<input type="submit" value="提交"　/>
			</form>
		</div>
	</body>
</html>
