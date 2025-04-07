<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Spring Boot + JSP</title>
</head>
<body>
<h2>Message from Spring Boot:</h2>
<p>${message}</p>
<form action="/hello" method="get">
    <input type="text" name="msg" placeholder="Enter your message" />
    <button type="submit">Refresh</button>
</form>
</body>
</html>
