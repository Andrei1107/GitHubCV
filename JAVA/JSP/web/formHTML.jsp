<%--
  Created by IntelliJ IDEA.
  User: oprea
  Date: 9/11/2019
  Time: 7:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>formHTML</title>
</head>
<body>
<h3>User Register</h3>
<div style="border:1px solid #D0D0D0;width:400px;padding:10px;">

    <form method = "GET" action="formProcessing.jsp">
        User Name: <input type="text" name="userName" value="" >
        <br>
        Password : <input type="password" name="password" value="">

        <hr>
        First Name: <input type="text" name="firstName">
        <br>
        Last Name: <input type="text" name="lastName">
        <br>
        Gender: <input type="radio" name="gender" value ="M"> Male
        <input type="radio" name="gender" value="F"> Female
        <hr>
        Address:
        <br>
        <input type="text" name="address" size="50">
        <input type="text" name="address" size="50">
        <input type="text" name="address" size="50">

        <hr>
        <input type="submit" value="Submit">
    </form>

</div>
</body>
</html>
