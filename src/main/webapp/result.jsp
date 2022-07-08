<%--
  Created by IntelliJ IDEA.
  User: truon
  Date: 7/8/2022
  Time: 4:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
</head>
<body>

<h2>${requestScope.message}</h2>

<img width="500px" src="${pageContext.request.contextPath}/images/${requestScope.fileName}">

<a href="download?img=${requestScope.fileName}">Download</a>

</body>
</html>
