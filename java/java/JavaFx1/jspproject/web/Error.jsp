<%-- 
    Document   : Error
    Created on : Mar 25, 2023, 8:59:59 AM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
        <title>JSP Page</title>
    </head>
    <%@page isErrorPage="true"%>
    <body>
        <div class='alert alert-danger m-4' role='alert'>
            <%= "error = " + exception.getMessage() %>
        </div>
    </body>
</html>
