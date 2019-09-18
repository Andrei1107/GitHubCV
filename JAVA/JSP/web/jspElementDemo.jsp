<%--
  Created by IntelliJ IDEA.
  User: oprea
  Date: 9/11/2019
  Time: 6:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jspElementDemo</title>
</head>
<body>
<jsp:element name="data">

    <h3>Please view source of this page</h3>

    <%--  Create Employee object and setting value for its fields --%>

    <jsp:useBean id="emp"
                 class="beans.Employee">

        <jsp:setProperty name="emp" property="empNo" value="E01" />
        <jsp:setProperty name="emp" property="empName" value="Smith" />

    </jsp:useBean>


    <jsp:element name="employee">
        <jsp:attribute name="empNo" trim="true">
            <jsp:getProperty name="emp" property="empNo" />
        </jsp:attribute>
        <jsp:body>
            <jsp:getProperty name="emp" property="empName" />
        </jsp:body>
    </jsp:element>





</jsp:element>
</body>
</html>
