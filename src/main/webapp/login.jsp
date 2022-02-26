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
</head>
<body>
    <div align="center">
        <h1>Employee Login Form</h1>
        <form action="<%=request.getContextPath()%>/login" method="POST">
            <table style="width: 20%">
                <tr>
                    <td>Username</td>
                    <td><input type="text" name="username"/></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type="text" name="password"/></td>
                </tr>
            </table>
            <input type="submit" value="Submit"/>
        </form>
    </div>
</body>
</html>
