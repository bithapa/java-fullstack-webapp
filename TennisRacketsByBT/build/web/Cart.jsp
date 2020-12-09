<%-- 
    Document   : Cart
    Created on : Nov 29, 2020, 9:11:22 PM
    Author     : bthapa01
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Your Cart</title>
        <link rel="stylesheet" type="text/css" href="template.css">
    </head>
    <body>
       <%@include file="Header.html"%>
       
    <div id="content">
         <div id="content-inner">
             <main id="contentbar">
             <div class="article">
                 <c:choose>
                     <c:when test="${empty cartList or cartList.number == 0}">
                         <h3>Your cart is empty :(</h3>
                         <img src="images/emptycart.png" height="250"/>
                     </c:when>
                     <c:when test="${cartList.number >= 1}">
                         <h1>Your Cart:</h1>
                         <h3>You have added ${cartList.number} racket<c:if test="${cartList.number !=1}">s</c:if>!</h3>
                         <table border='1'>
                             <tr>
                                 <th><h2>Racket</h2></th>
                                 <th><h2>Image</h2></th>
                                 <th><h2>Price</h2></th>
                                 <th><h2>Drop from Cart</h2></th>
                             </tr>
                             <c:forEach var="racket" items="${cartList.rackets}">
                                 <tr>
                                     <td><a href="RacketDetails?id=${racket.id}"><h3>${racket.id}</h3></a></td>
                                     <td><img src="${racket.image}" weidth="100" height="100"></td>
                                     <td><h3>$${racket.price}</h3></td>
                                     <td><a href="Drop?id=${racket.id}"><h3>Remove</h3></a></td>
                                 </tr>
                             </c:forEach>
                             <tr>
                                 <td></td>
                                 <td><h3>Total Price</h3></td>
                                 <td colspan="100"><h3>$${cartList.totalPrice}</h3></td>
                             </tr>

                         </table>
                     </c:when>
                 </c:choose>
             </div>
             </main>				
         </div>
     </div>
    <%@include file="SiteNav.html"%>
    <%@include file="Footer.html"%>
    </body>
</html>
