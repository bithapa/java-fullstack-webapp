<%-- 
    Document   : Home
    Created on : Dec 1, 2020, 1:51:52 PM
    Author     : bthapa01
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Tennis Rackets by BT</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="template.css">
    </head>
<body>
    <%
        if (session.getAttribute("login") == null){
            response.sendRedirect("Restricted.jsp");
        }
    %>
    <%@include file="/Header.html"%>
    
    <div id="content">
    <div id="content-inner">
	<main id="contentbar">
	<div class="article">
            <h1>Welcome to the home of Tennis Rackets!</h1>
            <ul>   
                <li><h2>Here you'll find quality tennis rackets from the best brands in the world!</h2></li>
                <li><h2>Check 'Inventory' for all the rackets available.</h2></li>
                <li><p>To add new racket (for admin), check 'Add new'.</p></li>
            </ul>
        </div>
	</main>				
    </div>
    </div>
    
    <%@include file="SiteNav.html"%>
    <%@include file="Footer.html"%>
</body>
</html>