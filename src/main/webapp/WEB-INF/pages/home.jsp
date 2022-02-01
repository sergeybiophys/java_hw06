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
<%--    <%
        ResultSet resultSet = DbConnection.GetAll();
        StringBuilder stringBuilder = new StringBuilder();
        try{
            while(resultSet.next())
            {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("username");
                String email = resultSet.getString("email");
                Integer age = resultSet.getInt("age");
                System.out.printf("%3d | %-20s | %-20s | %-3d%n" , id, name, email,age);

                stringBuilder.append("<div style=\""+"display: flex; flex: wrap; width: 60%; margin: 0 auto; margin-top: 20px;  background-color: white; height: 35px; justify-content: space-around; border: 1px solid lightblue;\""+">");
                stringBuilder.append("<div style=\""+"color:red; margin-right: 10px; \""+">"+id+"</div>");
                stringBuilder.append("<div>"+name+"</div>");
                stringBuilder.append("<div>"+email+"</div>");
                stringBuilder.append("<div>"+age+"</div>");
                stringBuilder.append("</div>");

                {
                    out.println(stringBuilder);
                }

            }
        }catch(SQLException e)
        {
            e.printStackTrace();
        }

    %>--%>

<%
    {
        out.println(request.getAttribute("htmlString"));
    }
%>

</body>
</html>
