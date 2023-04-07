import java.net.*;
import java.io.*;
import java.util.*;

public class SocketOfServer {
    public static void main(String[] args)
            throws IOException {
        // register service on port 3456
        ServerSocket ss = new ServerSocket(3456); // for creating server program
        // wait for client connection (after creating socket, it enters into infinite
        // loop and waits for client connection)
        Socket cs = ss.accept();
        // get i/o streams from socket
        Scanner ins = new Scanner(cs.getInputStream());
        PrintWriter outs = new PrintWriter(cs.getOutputStream(), true);
        // perform IO
        String s = ins.nextLine();
        System.out.println("From client: " + s);
        outs.println("Hello from server program");
        // close the connection
        outs.close();
        ins.close();
        cs.close();
        ss.close();
    }
}
