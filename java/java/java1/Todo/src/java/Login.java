/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DELL
 */
public class Login extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        String usr = req.getParameter("username");
        String pass = req.getParameter("password");
        if(usr.equals("admin") && pass.equals("admin123")) {
            RequestDispatcher rd = req.getRequestDispatcher("Welcome");
            rd.forward(req, res);
        } else {
            out.println("Sorry, bad credentials");
            RequestDispatcher rd = req.getRequestDispatcher("/index.html");
            rd.include(req, res);
            
        }
    }

}
