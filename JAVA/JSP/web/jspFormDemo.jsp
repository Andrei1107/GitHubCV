<%--
  Created by IntelliJ IDEA.
  User: oprea
  Date: 9/11/2019
  Time: 7:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>formDemo</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>

<jsp:useBean id="emp3"
             class="beans.Employee">

    <jsp:setProperty name="emp3" property="empNo" value="E01" />
    <jsp:setProperty name="emp3" property="empName" value="Smith" />

</jsp:useBean>


<br>
Emp No: <input type="text" value = "${emp.empNo}">
<br>
Emp Name <input type="text" value = "${emp.empName}">
</body>


</html>
