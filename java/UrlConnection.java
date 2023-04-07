import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class UrlConnection {
    public static void main(String[] args) {
        try {
            URL uri = new URL("https://outlook.office.com/mail/");
            URLConnection conxn = uri.openConnection();
            InputStream ins = conxn.getInputStream();
            int i;
            String s = new String();
            while ((i = ins.read()) != -1) {
                s += (char) i;
            }
            System.out.println(s);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
