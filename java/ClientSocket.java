import java.net.*;
import java.io.*;
import java.util.*;

public class ClientSocket {
    public static void main(String[] args) throws IOException {
        // open connection to server at port 3456
        Socket cs = new Socket("localhost", 3456); // for creating client program
        // get input file handle from the socket and read the input
        Scanner ins = new Scanner(cs.getInputStream());
        PrintWriter outs = new PrintWriter(cs.getOutputStream(), true);
        // perform IO
        outs.println("Hello from client program");
        String s = ins.nextLine();
        System.out.println("From Server: " + s);
        ins.close();
        outs.close();
        cs.close();
    }
}
