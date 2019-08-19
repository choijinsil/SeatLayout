<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% // requesst.getparameter 대신 사용하는 el, ${ 키값 }%>
	<h1>로그인 페이지 ${login }</h1>
	
	<form action="login.do" method="post">

	아이디 : <input type="text" name="id"><br> 
	비밀번호 : <input type="text" name="pwd"><br>
	<br> <input type="submit" value="확인">
	
	</form>
</body>
</html>