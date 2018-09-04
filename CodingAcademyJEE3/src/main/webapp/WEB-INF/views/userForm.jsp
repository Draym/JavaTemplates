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
    <%@include file="fragment/header.jsp" %>
</head>

<body class="col-md-12">
<div class="row">
    <div class="title text-center">Add a new User :</div>
</div>

<form:form method="post" action="${pageContext.request.contextPath}/users" cssClass="form-horizontal">
    <div class="row">
        <div class="col-md-6">
            <div class="form-group">
                <form:label path="name" for="name" class="control-label col-sm-7">Name : </form:label>
                <form:input path="name" id="name" type="text" class="validate"/>
            </div>
            <div class="form-group">
                <form:label path="email" for="email" class="control-label col-sm-7">Email : </form:label>
                <form:input path="email" id="email" type="text" class="validate"/>
            </div>
            <div class="form-group">
                <form:label path="password" for="password" class="control-label col-sm-7">Password : </form:label>
                <form:input path="password" id="password" type="text" class="validate"/>
            </div>
        </div>
        <div class="col-md-6">
            <div class="form-group">
                <form:label path="location" for="location" class="control-label col-sm-2">Location : </form:label>
                <form:input path="location" id="location" type="text" class="validate"/>
            </div>
            <div class="form-group">
                <form:label path="age" for="age" class="control-label col-sm-2">Age : </form:label>
                <form:input path="age" id="age" type="number" class="validate"/>
            </div>
        </div>
    </div>
    <div class="row col-md-12">
        <form:button class="pull-right" type="submit">Create</form:button>
    </div>
</form:form>

<div class="row">
    <div class="col-md-offset-6 col-md-1">
        <a href="${pageContext.request.contextPath}/hi">home</a>
    </div>
</div>

<%@include file="fragment/footer.jsp" %>
</body>
</html>
