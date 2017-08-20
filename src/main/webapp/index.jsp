<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>lpz doing springMVC</title>
</head>
<body>
	<h2>Hello World!</h2>
	
	<form action="login">
	         用户名：<input id="username" name="username" type="text"></input><br>
	         密&nbsp;&nbsp;码：<input id="username" name="password" type="password"></input><br>
	    <input type="submit">
	</form>sss
	
	<span>当前IP：<%=request.getRemoteAddr() %></span>

</body>
</html>
