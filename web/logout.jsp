<%-- 
    Document   : registrationsuccess
    Created on : Feb 13, 2020, 10:19:33 PM
    Author     : Zafrul Hasan Nasim
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <link href="css/logout.css" rel="stylesheet">
        <title>Logout Successful</title>
    </head>
    <body>
        <div class="container">
            <div class="row text-center" style="float: center" align="center">
                <div class="col col-sm-offset-4">
                    <%
                        session.invalidate();
                    %>
                    <br><br> <h2 style="color:#0fad00">Success</h2>
                    <img src="image/chktrue.jpg">
                    <p style="font-size:20px;color:#5C5C5C;">You are Successfully logged out. Go to homepage to sign in again.</p>
                    <a href="index.jsp" class="btn btn-success">    Home     </a>
                    <br><br>
                </div>

            </div>
        </div>
    </body>
</html>
