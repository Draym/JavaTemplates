<%--
  Created by IntelliJ IDEA.
  User: kevin
  Date: 24/09/2017
  Time: 15:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Info</title>
    <%@include file="fragment/header.jsp" %>
</head>

<body class="col-md-12">
<span class="title">Welcome ${name} !</span>

<table>
    <tr>
        <td>Email : </td>
        <td>${email}</td>
    </tr>
    <tr>
        <td>Location : </td>
        <td>${location}</td>
    </tr>
    <tr>
        <td>Age : </td>
        <td>${age}</td>
    </tr>
</table>

<div class="row">
    <div class="col-md-offset-6 col-md-1">
        <a href="${pageContext.request.contextPath}/hi">home</a>
    </div>
</div>

<%@include file="fragment/footer.jsp" %>
</body>
</html>
