<%@ page import="beans.HelloBean" %><%--
  Created by IntelliJ IDEA.
  User: oprea
  Date: 9/10/2019
  Time: 9:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>useBeanDemo</title>
</head>
<body>
<jsp:useBean id="helloBean"
             class="beans.HelloBean"></jsp:useBean>


<h3>Say Hello:</h3>

<jsp:getProperty name="helloBean" property="hello" />

<!-- Set property name for helloBean -->
<jsp:setProperty  name="helloBean" property="name" value="JSP"/>
<h3>Say Hello after setName</h3>

<jsp:getProperty name="helloBean" property="hello" />

<jsp:setProperty name="helloBean" property="name" value="Andrei"/>

<jsp:getProperty name="helloBean" property="name"/>

</body>
</html>
