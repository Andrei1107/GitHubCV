<%--
  Created by IntelliJ IDEA.
  User: oprea
  Date: 9/10/2019
  Time: 9:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.Date,java.text.*"%>
<html>
<head>
    <title>dateTime</title>
</head>
<body>


<%
    Date now = new Date();

    DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss SSS");


%>

<h4>Current Time:</h4>
<%=df.format(now)%>
</body>
</html>
