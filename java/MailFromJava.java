import java.net.Authenticator;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

public class MailFromJava extends Authenticator {
    static String from = "ganesh410adhikari@gmail.com";
    static String pass = "ctdchztthicqhqrk";
    static String host = "smtp.googlemail.com";
    static String port = "587";
    static InternetAddress to;

    public static void main(String[] args) {
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        // props.put("mail.smtp.ssl.trust", "smtp.googlemail.com");
        props.put("mail.smtp.starttls.enable", "true"); // start tls transport layer
        // security
        props.put("mail.debug", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", port);
        props.put("mail.smtp.user", from);
        props.put("mail.smtp.password", pass);
        // get session object
        try {
            to = new InternetAddress("ganesh149adhikari@gmail.com");
            Session sess = Session.getDefaultInstance(props);
            MimeMessage msg = new MimeMessage(sess);
            msg.setFrom(new InternetAddress(from));
            msg.addRecipient(Message.RecipientType.TO, to);
            msg.setSubject("Test mail from java");
            msg.setText("Hello World");
            Transport trans = sess.getTransport("smtp");
            trans.connect(host, from, pass);
            trans.sendMessage(msg, msg.getAllRecipients());
            System.out.println("Message send succesfully");

        } catch (Exception e) {
            System.out.println("couldn't send Message, Error::");
            System.out.println(e.getMessage());
        }
    }

}
