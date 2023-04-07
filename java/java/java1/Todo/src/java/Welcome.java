/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DELL
 */
public class Welcome extends HttpServlet {

   protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
       res.setContentType("text/html");
       PrintWriter out = res.getWriter();
       String usr = req.getParameter("username");
       out.println("Welcome" + usr);
       
   }
}
