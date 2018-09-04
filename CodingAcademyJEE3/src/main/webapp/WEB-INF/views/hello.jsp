<%--
  Created by IntelliJ IDEA.
  User: kevin
  Date: 24/09/2017
  Time: 13:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<%-- IMPORTER le fichier css :
1) <spring:url> recupère le path du fichier css 'custom.css' sur le serveur et stock la valeur dans 'coreCss'
2) <link> ajout d'une stylesheet (html classique) avec la valeur contenue dans ${coreCss}

tips: ${...} accède à la valeur d'une variable déclaré dans un model
--%>
<head>
    <%@include file="fragment/header.jsp" %>
</head>

<body class="col-md-12">

<%-- Utilisation de la variable créé dans LinkController.java avec model.addAttribute
utilisez ${nomVariable} afin d'accéder à sa valeur
--%>
<div class="row">
    <div class="text-center title">${message}</div>
</div>
<div class="row">
    <div class="col-md-offset-6 col-md-1">
        <a href="${pageContext.request.contextPath}/userForm">create a new user</a>
    </div>
</div>
<div class="row">

    <div class="col-md-offset-2">
        <table>
            <tr>
                <th class="col-md-1"></th>
                <th class="col-md-2"></th>
                <th class="col-md-3"></th>
                <th class="col-md-3"></th>
                <th class="col-md-1"></th>
                <th class="col-md-2"></th>
            </tr>
            <c:forEach items="${users}" var="user">
                <tr>
                    <td>${user.id}</td>
                    <td>${user.name}</td>
                    <td>${user.email}</td>
                    <td>${user.location}</td>
                    <td>${user.age}</td>
                    <td>${user.password}</td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>


<%@include file="fragment/footer.jsp" %>

</body>
</html>
