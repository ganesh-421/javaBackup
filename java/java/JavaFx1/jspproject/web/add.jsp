<%-- 
    Document   : add
    Created on : Mar 25, 2023, 6:34:48 AM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>sum</title>
    </head>
    <body>
    <center>
        <h1>Addition</h1>
        <form action="add.jsp" method="get">
            <input type="text" name="n1" placeholder = "first number"/><br/><br />
            <input type="text" placeholder = "second number" name="n2"/>  
            <input type="submit"/>            
        </form>
    </center>
        <hr size ="4"/>
    <center><h2>Result</h2></center>
    <center>
        <div>
            <%
                if(request.getParameter("n1") != null && request.getParameter("n2") != null) 
                {
                int n1 = Integer.parseInt(request.getParameter("n1"));
                int n2 = Integer.parseInt(request.getParameter("n2"));
                int sum = n1 + n2;
                out.println("Sum = " + sum);
                } else {
                out.println("Please enter numbers");
            }
            %>
        </div>
    </center>
    </body>
</html>
