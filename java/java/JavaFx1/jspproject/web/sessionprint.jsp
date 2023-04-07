<%-- 
    Document   : sessionprint
    Created on : Mar 25, 2023, 9:20:12 AM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello <%out.println((String)session.getAttribute("user"));%></h1>
    </body>
</html>
