<%-- 
    Document   : Login
    Created on : Dec 1, 2020, 4:11:55 PM
    Author     : bthapa01
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Log In</title>
        <link rel="stylesheet" type="text/css" href="template.css">
    </head>
    <body>
    <center>
        <h1>Please enter the correct password!</h1>
        
        <form action="Login" method="get">
            <h2>Password: </h2>
            <input type="password" name="password" required/>
            <input type="submit" value="Login"/>
        </form>
    </center>
    </body>
</html>
