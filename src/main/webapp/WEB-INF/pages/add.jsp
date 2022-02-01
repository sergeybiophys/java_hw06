<%--
  Created by IntelliJ IDEA.
  User: elekta
  Date: 01.02.2022
  Time: 15:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Student</title>
</head>
<body>
<div style="text-align: center">
    <h3>Fill the form</h3>
</div>
<div style="display: flex; width: 15%; margin: 0 auto; margin-top: 30px; background-color: palegreen;">
    <form method='post' action='/add'>
        <label>User Name: <input style="margin-top: 30px;"  name='firstname'/></label><br/>
        <label>Email: <input style="margin-left:1px; " name='lastname' /></label><br/>
  <%--      <label>Group: <input style="margin-left:25px; " name='group'/></label><br/>--%>
        <input value='ADD USER' style="margin-left:85px; margin-top: 30px; height: 30px; width: 100px; " type='submit'/>
    </form>
</div>
</body>
</html>
