<%--
  Created by IntelliJ IDEA.
  User: oprea
  Date: 9/10/2019
  Time: 9:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page errorPage ="error.jsp"%>
<html>
<head>
    <title>PageHasError</title>
</head>
<body>
<h2>Page has Error</h2>


<%
    // Error divided by 0
    int i = 1000 / 0;
%>


</body>
</html>
