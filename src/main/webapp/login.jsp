<%--
  Created by IntelliJ IDEA.
  User: Hp
  Date: 2/26/2022
  Time: 9:51 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login Form</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<div align="center">
    <div class="form-group">
        <h1>Employee Login Form</h1>
        <form action="<%=request.getContextPath()%>/login" method="POST">
            <table style="width: 20%">
                <tr>
                    <td>Username</td>
                    <td><input type="text" name="username"/></td>
                </tr>
    </div>
    <div class="form-group">
        <tr>
            <td>Password</td>
            <td><input type="text" name="password"/></td>
        </tr>
        </table>
    </div>
    <div>
        <input type="submit" value="Submit" class="btn btn-primary"/>
    </div>
    </form>
</div>
</body>
</html>
