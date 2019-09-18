<%--
  Created by IntelliJ IDEA.
  User: oprea
  Date: 9/10/2019
  Time: 7:52 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page import="java.util.*, java.text.*"  %>
<%@ page import="java.util.Random,java.text.*"%>
<%@ page import="java.util.List, java.text.*" %>
<%@ page import="javax.servlet.annotation.WebServlet" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>JSP</title>
  </head>
  <body>
  <h1>Date is:</h1>
  <%
    Random random = new Random();

    // Returns a random number (0, 1 or 2)
    int randomInt = random.nextInt(3);


    if (randomInt == 0) {
  %>

  <h1>Random value =<%=randomInt%></h1>

  <%
  } else if (randomInt == 1) {
  %>

  <h2>Random value =<%=randomInt%></h2>

  <%
  } else {
  %>
  <h3>Random value =<%=randomInt%></h3>
  <%
    }
  %>

  <a href="<%= request.getRequestURI() %>">Try Again</a>

  <%@ include file="methodInJsp.jsp" %>

  <%@include file="includeDemo.jsp"%>

  <%@include file="jspIncludeDemo.jsp"%>

  <%@include file="useBeanDemo.jsp"%>

<%@include file="jspElementDemo.jsp"%>

<h1>JspElementDemo2</h1>
  <%@include file="jspElementDemo2.jsp"%>


<%@include file="jspFormDemo.jsp"%>







  </body>
</html>
