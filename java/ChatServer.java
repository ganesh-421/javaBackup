import java.net.*;
import java.io.*;
import java.util.*;

public class ChatServer {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(1234);
            Socket rs = ss.accept();
            Scanner ins = new Scanner(rs.getInputStream());
            PrintWriter outs = new PrintWriter(rs.getOutputStream(), true);
            Scanner sc = new Scanner(System.in);
            String cmsg, smsg;
            do {
                System.out.print("Server: ");
                smsg = sc.nextLine(); // write message to client
                outs.println(smsg); // send message to client
                cmsg = ins.nextLine(); // get message from client
                System.out.println("Client: " + cmsg); // display client message
            } while (!smsg.equals("bye"));
            ins.close();
            outs.close();
            rs.close();
            ss.close();
            sc.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
