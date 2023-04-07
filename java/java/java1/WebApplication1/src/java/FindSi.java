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
public class FindSi extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        String pr = req.getParameter("pronciple");
        String ra = req.getParameter("rate");
        String ti = req.getParameter("time");
        Double p = Double.parseDouble(pr);
        Double r = Double.parseDouble(ra);
        Double t = Double.parseDouble(ti);
        Double si = p * t * r / 100;
        out.println("<b>si="+si + "</b>");
    }

}
