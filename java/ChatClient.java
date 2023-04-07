import java.net.*;
import java.io.*;
import java.util.*;

public class ChatClient {
    public static void main(String[] args) {
        try {
            Socket cs = new Socket("localhost", 1234);
            Scanner ins = new Scanner(cs.getInputStream());
            PrintWriter outs = new PrintWriter(cs.getOutputStream(), true);
            Scanner sc = new Scanner(System.in);
            String cmsg, smsg;
            do {
                smsg = ins.nextLine(); // get message from server
                System.out.println("Server: " + smsg); // display server message
                System.out.print("Client: ");
                cmsg = sc.nextLine(); // write message to server
                outs.println(cmsg); // send message to server
            } while (!cmsg.equals("bye"));
            ins.close();
            outs.close();
            cs.close();
            sc.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
