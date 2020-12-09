<%-- 
    Document   : RacketDetails
    Created on : Nov 28, 2020, 2:13:49 PM
    Author     : bthapa01
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>${currentRacket.id}</title>
        <link rel="stylesheet" type="text/css" href="template.css">
    </head>
    <body>
        <%@include file="Header.html"%>
        
        <div id="content">
            <div id="content-inner">
                <main id="contentbar">
                <div class="article">     
                    <h1>${currentRacket.id}</h1>
                    <img src="${currentRacket.image}" weidth="500" height="500">
                    <h2><a href="Cart?id=${currentRacket.id}">Add to Cart</a></h2>
                    <div id="footerblurb">
                        <div class="column">
                            <h2><span>Brand</span></h2>
                            <p>${currentRacket.brandName}</p>
                        </div>	

                        <div class="column">
                            <h2><span>Family</span></h2>
                            <p>${currentRacket.familyName}</p>
                        </div>

                        <div class="column">
                            <h2><span>Version</span></h2>
                            <p>${currentRacket.versionName}</p>
                        </div>	

                        <div class="column">
                            <h2><span>Price</span></h2>
                            <p>$${currentRacket.price}</p>
                        </div>

                        <div class="column">
                            <h2><span>Head Size</span></h2>
                            <p>${currentRacket.headSize} sq.inch</p>
                        </div>

                        <div class="column">
                            <h2><span>Weight</span></h2>
                            <p>${currentRacket.weight} lbs.</p>
                        </div>

                        <div class="column">
                            <h2><span>String Pattern</span></h2>
                            <p>${currentRacket.stringPattern} main vs. cross</p>
                        </div>

                        <div class="column">
                            <h2><span>Description</span></h2>
                            <p>${currentRacket.versionDesc}</p>
                        </div>
                        <div class="clr"></div>
                </div>
                </main>				
            </div>
        </div>
        </div>
    <%@include file="SiteNav.html"%>
    <%@include file="Footer.html"%>
    </body>
</html>
