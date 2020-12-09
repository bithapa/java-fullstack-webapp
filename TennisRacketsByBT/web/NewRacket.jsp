<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add New Racket</title>
         <link rel="stylesheet" type="text/css" href="template.css">
    </head>
<body>
        <%
        if(session.getAttribute("login") == null){
            response.sendRedirect("Restricted.jsp");
        }
        %>
        
        <%@include file="Header.html"%>
        
<div id="content">
    <div id="content-inner">
	<main id="contentbar">
	<div class="article">
            <h1>Add new racket to the inventory.</h1>
            <!--<p>All fields are required.</p>-->
            <form action="NewRacket" method="get" id="err">
                        <h2>Brand:</h2>
                        <select name="brand" value="${param.brand}">
                             <c:forEach items="select,Babolat,Head,Prince,Yonex,Wilson" var="brand">
                                <option name="brand" value="${brand}" <c:if test="${param.brand == brand}">selected="true"</c:if>>${brand}</option>
                            </c:forEach>
                        </select>
                        <br>
                        <c:if test="${errors.brandMissing}">Please select a brand name!</c:if>
                            
                        
                        <h2>Family:</h2>
                        <input type="text" name="family" value="${param.family}"/>
                        <c:if test="${errors.familyMissing}">
                            <p>Please provide racket family!</p>
                        </c:if>
                        
                            
                        <h2>Version:</h2>
                        <input type="text" name="version" value="${param.version}"/>
                        <br>
                        <c:if test="${errors.versionMissing}">
                            Please provide racket version!
                        </c:if>
                        
                            
                        <h2>Price:</h2>
                        <input type="text" name="price" value="${param.price}"/> $
                        <br>
                        <c:if test="${errors.priceMissing}">Please enter the price!</c:if>
                        <c:if test="${errors.priceNotNumeric}">Price must be a numeric value!</c:if>
                        <c:if test="${errors.priceNegative}">Price must be positive!</c:if>
                        <c:if test="${errors.priceZero}">Price should not be zero!</c:if>
                        
                        
                        <h2>Head Size:</h2>
                        <select name="size" value="${param.size}">
                            <c:forEach items="select,97,98,100,102,105,110" var="size">
                                <option name="size" value="${size}" <c:if test="${param.size == size}">selected="true"</c:if>>${size}</option>
                            </c:forEach> 
                        </select> sq. inch
                        <br>
                        <c:if test="${errors.sizeMissing}">Please select the size!</c:if>
                        
                        
                        <h2>Weight:</h2>
                        <select name="weight" value="${param.weight}">
                            <c:forEach items="select,10.8,11,11.8,12,12.4,12.6,13.4,13.6" var="weight">
                                <option name="weight" value="${weight}" <c:if test="${param.weight == weight}">selected="true"</c:if>>${weight}</option>
                            </c:forEach> 
                        </select> lbs.
                        <br>
                        <c:if test="${errors.weightMissing}">Please select the weight!</c:if>
                        
                        
                        <h2>String Pattern</h2>
                        <input type="text" name="pattern" value="${param.pattern}"/> main vs. cross
                        <br>
                        <c:if test="${errors.patternMissing}">Please provide the pattern!</c:if>
                        <c:if test="${errors.patternWrongFormat}">
                            Please enter the standard pattern format as `MAINxCROSS`:<br>
                            MAIN: 16 or 18<br>
                            CROSS: 16 or 17 or 18 or 19 or 20
                        </c:if>
                        
                            
                        <h2>Description:</h2>
                        <input type="text" name="description" value="${param.description}"/>
                        <br>
                        <c:if test="${errors.descriptionMissing}">
                            Please provide racket description!
                        </c:if>
                        <br>
                        <input type="submit" value="Add New Racket"/>
                    </form>
            </div>
	</main>				
        </div>
	</div>
        <%@include file="SiteNav.html"%>
        <%@include file="Footer.html"%>
        
    </body>
</html>