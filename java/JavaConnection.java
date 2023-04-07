import java.sql.*;
public class JavaConnection {
    public static void main(String[] args) {
        System.out.println("Hello");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "gunace123");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM products");
            while(rs.next()) {
                System.out.println(rs.getNString("title"));
            }
            conn.close();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
     }
    

}
