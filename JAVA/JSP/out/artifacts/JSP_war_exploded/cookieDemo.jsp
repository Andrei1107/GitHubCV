<%@ page import="beans.CookieUtils" %><%--
  Created by IntelliJ IDEA.
  User: oprea
  Date: 9/11/2019
  Time: 8:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>cookieDemo</title>
</head>
<body>
<%
    CookieUtils.demoUserCookie(request,response, out);
%>

<a href ="">Try again!!</a>
</body>
</html>
