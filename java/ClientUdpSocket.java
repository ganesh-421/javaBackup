import java.net.*;
import java.io.*;
import java.util.*;

public class ClientUdpSocket {
    public static void main(String[] args) {
        try {
            DatagramSocket ds = new DatagramSocket();
            byte[] bufr = new byte[256];
            String msg = "Hello from Client";
            bufr = msg.getBytes();
            InetAddress add = InetAddress.getByName("localhost");
            DatagramPacket pkt = new DatagramPacket(bufr, bufr.length, add, 1234);
            ds.send(pkt);
            // receive from server:
            pkt = new DatagramPacket(bufr, bufr.length);
            ds.receive(pkt);
            String sRep = new String(pkt.getData());
            System.out.println("reply form serever:" + sRep);
            ds.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
