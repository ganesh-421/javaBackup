import java.io.InputStream;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;

public class IpAddressJava {
    public static void main(String[] args) {
        try {
            InetAddress ip;
            ip = InetAddress.getByName("www.google.com");
            System.out.println("Hostname: " + ip.getHostName());
            System.out.println("Ip Address: " + ip.getHostAddress());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
