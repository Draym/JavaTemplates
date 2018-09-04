<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>

<head>
    <%@include file="fragment/header.jsp" %>
</head>

<body class="col-md-12">
<h2>Hello World!</h2>
<a class="titleLink" href="${pageContext.request.contextPath}/hi"> Let's say Hi!</a>

<%@include file="fragment/footer.jsp" %>

</body>
</html>
