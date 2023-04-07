/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DELL
 */
public class InsertData extends HttpServlet {
    String databaseDriver;
    String databaseUrl;
//    @override
    public void init(ServletConfig config) throws ServletException {
        databaseDriver = config.getInitParameter("driver");
        databaseUrl = config.getInitParameter("url");
    }
//    @override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        try{
            Class.forName(databaseDriver);
            Connection conn = DriverManager.getConnection(databaseUrl, "gunace", "gunace123");
            String sql = "INSERT INTO info values(?, ?)";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, req.getParameter("name"));
            st.setString(1, req.getParameter("Address"));
        }catch(ClassNotFoundException | SQLException e) {
            out.println(e.getMessage());
        }
    }
}
