<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="sv.from.work.db.DbConnection" %>
<%@ page import="java.sql.SQLException" %><%--
  Created by IntelliJ IDEA.
  User: elekta
  Date: 01.02.2022
  Time: 15:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<div style="display: flex;  width: 60%; margin: 0 auto;
    background-color: palegreen; height: 35px; justify-content: space-around;">
    <div>ID</div>
    <div>USER NAME</div>
    <div>EMAIL</div>
    <div>GROUP</div>
</div>
<%
    {
        out.println(request.getAttribute("htmlString"));
    }
%>

</body>
</html>
