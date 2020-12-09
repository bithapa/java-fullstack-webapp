<%-- 
    Document   : Restricted
    Created on : Dec 1, 2020, 3:54:20 PM
    Author     : bthapa01
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <!-- check if the user is logged in-->
        <%
            if (session.getAttribute("login") == null)
                response.sendRedirect("Login.jsp");
            else
            response.sendRedirect("Home.jsp");
        %>
        <form action="Login">
            <p>This is restricted section of the website!</p>
            <input type="submit" value="Logout" />
        </form>
    </body>
</html>
