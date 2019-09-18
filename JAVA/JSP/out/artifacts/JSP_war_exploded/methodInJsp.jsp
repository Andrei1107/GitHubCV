<%--
  Created by IntelliJ IDEA.
  User: oprea
  Date: 9/10/2019
  Time: 9:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>MethodJsp</title>
</head>
<body>

<%!

    public int sum(int a, int b)  {
        return a + b;
    }

    public void exampleMethod()  {
        // Code here
    }
%>
<h1>
    1 + 2 =    <%=sum(1, 2)%>
</h1>


</body>
</html>
