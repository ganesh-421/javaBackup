import java.sql.*;

public class DbConnection {
    public static void main(String[] args) {
        try {
            // Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/blog", "root", "gunace123");
            Statement stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM users");
            ResultSetMetaData rsmd = res.getMetaData();
            int columnsNumber = rsmd.getColumnCount();

            while (res.next()) {
                for (int i = 1; i <= columnsNumber; i++) {
                    if (i > 1)
                        System.out.print(",  ");
                    String columnValue = res.getString(i);
                    System.out.println(rsmd.getColumnName(i) + " " + columnValue);
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
