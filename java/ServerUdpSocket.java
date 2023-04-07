import java.net.*;
import java.io.*;

public class ServerUdpSocket {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(1234);
        // receive request
        byte[] bufr = new byte[256];
        DatagramPacket pkt = new DatagramPacket(bufr, bufr.length);
        ds.receive(pkt);
        String sRes = new String(" :::: Hello I am a response from server ::::");
        bufr = sRes.getBytes();
        InetAddress add = pkt.getAddress();
        int port = pkt.getPort();
        pkt = new DatagramPacket(bufr, bufr.length, add, port);
        ds.send(pkt);
        ds.close();
    }
}
