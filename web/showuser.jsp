<%--
  Created by IntelliJ IDEA.
  User: 12176
  Date: 2018/11/13
  Time: 15:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1">
<c:forEach items="${data}" var="emp">
    <tr><td>${emp.name}</td></tr>
</c:forEach>
</table>

</body>
</html>
