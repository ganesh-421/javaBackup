<%-- 
    Document   : Register
    Created on : Mar 25, 2023, 7:15:44 AM
    Author     : GANESH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register User</title>
    </head>
    <body>
        <%
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            String db_driver = "com.mysql.cj.jdbc.Driver";
            String db_user = "root";
            String db_pass = "gunace123";
            String db_url = "jdbc:mysql://localhost:3306/java";
            String sql = "INSERT INTO `users` (name, email, password) VALUES (?, ?, ?)";
//            String password_confirmation = request.getParameter("password_confirmation");
        %>
        <div class="alert alert-primary m-4" role="alert">
            <% out.println("Hello " + name + " I am registering you"); %>
        </div>
            <%--Applying database logic--%>
            <%@page import="java.sql.*" %>
            <%@page errorPage="Error.jsp"%>
            <%
//                try {
                    Class.forName(db_driver);
                    Connection conn = DriverManager.getConnection(db_url, db_user, db_pass);
                    PreparedStatement stmt = conn.prepareStatement(sql);
                    stmt.setString(1, name);
                    stmt.setString(2, email);
                    stmt.setString(3, password);
                    stmt.execute();
                    conn.close();
                    session.setAttribute("user", name);
//                }
//                out.print("<div class='alert alert-primary m-4' role='alert'>");
//                catch(SQLException se) {
//                    out.print("<div class='alert alert-primary m-4' role='alert'>" + "SQL Error " + se.getMessage());
//                } catch(ClassNotFoundException ce) {
//                    out.print("<div class='alert alert-primary m-4' role='alert'>" + "Class Error " + ce.getMessage());
//                } catch(Exception e) {
//                    out.print("<div class='alert alert-primary m-4' role='alert'>" + "Other Error " + e.getMessage());
//                } finally {
//                    out.print("</div>");
//                }           
            %>
            <a href="/jspproject/sessionprint.jsp">Print My Name</a>
    </body>
</html>
