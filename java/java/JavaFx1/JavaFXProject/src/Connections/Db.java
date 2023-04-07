/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connections;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;


/**
 *
 * @author DELL
 */
public class Db {
    Connection con;
    PreparedStatement st;
    ResultSet rs;
    public Db(String ClassName, String url, String userName, String password)
    {
        try {
         Class.forName(ClassName);
         con = DriverManager.getConnection(url, userName, password);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    public ResultSet selectEverything(String tablename) throws SQLException
    {
        try {
            st = con.prepareStatement("SELECT * FROM" + tablename);
            rs = st.executeQuery();
            return rs;
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally 
        {
            st.close();
            rs.close();
        }
        return null;
    }
}
