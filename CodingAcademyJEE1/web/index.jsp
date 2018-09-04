<%--
  Created by IntelliJ IDEA.
  User: kevin
  Date: 18/09/2017
  Time: 19:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <h1>Bonjour à tous</h1>
</head>
<body>

<form action="${pageContext.request.contextPath}/services" method="post" accept-charset="utf-8">
    <p>Full Name :
        <input type="text" name="name"/></p>

    <p>Password :
        <input type="password" name="password"/></p>

    <p>Age :
        <input type="number" name="age"/></p>

    <p>Genre :
        <input type="radio" name="gender" value="M"/> Male
        <input type="radio" name="gender" value="F"/> Female</p>

    <p>Country :
        <select name="countryCode">
            <option value="FR">France</option>
            <option value="US">United States</option>
        </select></p>

    <p>Animal :
        <select name="animalId">
            <option value="Cat">Cat</option>
            <option value="Dog">Dog</option>
        </select></p>

    <p>Action :
        <select name="action">
            <option value="Stand guard on"> Stand guard on</option>
            <option value="Wash"> Wash</option>
            <option value="Train"> Train</option>
            <option value="Kill"> Kill</option>
        </select></p>

    <p>Description :
        <textarea name="message"></textarea></p>

    <p>Submit button.
        <input type="submit" name="submit" value="submit"/></p>
</form>
</body>
</html>
