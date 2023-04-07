import java.net.*;

public class WorkingWithUrl {
    public static void main(String[] args) {
        try {
            URL uri = new URL("https://outlook.office.com/mail/");
            System.out.println("protocol: " + uri.getProtocol());
            System.out.println("Host name: " + uri.getHost());
            System.out.println("port: " + uri.getPort());
            System.out.println("File name: " + uri.getFile());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}