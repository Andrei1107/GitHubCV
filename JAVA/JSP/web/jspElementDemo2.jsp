<%--
  Created by IntelliJ IDEA.
  User: oprea
  Date: 9/11/2019
  Time: 7:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jspElementDemo2</title>
</head>
<body>

<data>

    <h3>Please view source of this page</h3>

    <%--  Create Employee and set value for its fields --%>

    <jsp:useBean id="emp2"
                 class="beans.Employee">

        <jsp:setProperty name="emp2" property="empNo" value="Andrei" />
        <jsp:setProperty name="emp2" property="empName" value="Smith" />

    </jsp:useBean>

    <employee empNo="<%=emp2.getEmpNo()%>">
        <%=emp2.getEmpName()%>
    </employee>

</data>


</body>
</html>
