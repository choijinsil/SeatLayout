<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
  <h1> 로그인 성공! </h1>
  
  <%
request.setCharacterEncoding("utf-8");

String id = request.getParameter("id");
String pwd = request.getParameter("pwd");

if((id.equals("admin") && pwd.equals("123")) ||
    (id.equals("user") && pwd.equals("111"))){
    session.setAttribute("id",id);
    response.sendRedirect("loginok.jsp");
    }else{
        //response.sendRedirect("loginfail.jsp");
    }
%>


</body>
</html>