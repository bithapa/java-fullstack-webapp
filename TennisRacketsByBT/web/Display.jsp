<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inventory | Tennis Rackets by BT</title>
         <link rel="stylesheet" type="text/css" href="template.css">
    </head>
    <body>
       <%--
        <%
        if(session.getAttribute("login") == null){
            response.sendRedirect("Restricted.jsp");
        }
        %>
       --%>
        
        <%@include file="Header.html"%>
        
        <div id="content">
            <div id="content-inner">
                <main id="contentbar">
                <div class="article">
                    <h1>Tennis Rackets:</h1>

                    <!-- check if the list is empty  if it is redirect to the RacketList servlet -->
                    <c:if test="${empty racketList.rackets}">
                        <c:redirect url="/RacketList"/>
                    </c:if>

                    <!-- display the RacketList in tabular form, use JSTL tag for iterating through objects properties-->  
                    <table border='1'>
                        <tr>
                            <th><h2>Racket</h2></th>
                            <th><h2>Image</h2></th>
                            <th><h2>Price</h2></th>
                            <th><h2>Add to Cart</h2></th>
                        </tr>
                        <c:forEach var="racket" items="${racketList.rackets}">
                            <tr>
                                <td><a href="RacketDetails?id=${racket.id}"><h3>${racket.id}</h3></a></td>
                                <td><img src="${racket.image}" height="100" width="100"></td>
                                <td><h3>$${racket.price}</h3></td>
                                <td align="center"><a href="Cart?id=${racket.id}"><h3>Add</h3></a></td>
                            </tr>
                        </c:forEach>
                    </table>
                </div>
                </main>				
            </div>
        </div>
        
        <%@include file="SiteNav.html"%>
        <%@include file="Footer.html"%>
        <%--<c:import url="SiteNav.jsp"/>--%>
    </body>
</html>

<!--


-->