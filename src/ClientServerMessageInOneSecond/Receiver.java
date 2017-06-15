package ClientServerMessageInOneSecond;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * Created by suraz on 4/21/17.
 */
public class Receiver {
    public static void main(String args[ ] ) throws SocketException, IOException
    {
        DatagramSocket clientsocket=new DatagramSocket(1024);

        InetAddress IpAddess= InetAddress.getByName("localhost");

        byte[] sendData=new byte[1024];
        byte[] receiveData=new byte[1024];

        String sentence="";
        sendData=sentence.getBytes();
        DatagramPacket receivepacket=new DatagramPacket(sendData,sendData.length);
        int port=receivepacket.getPort();
        DatagramPacket sendPacket=new DatagramPacket(sendData,sendData.length,IpAddess,9876);
        clientsocket.send(sendPacket);

        while (true){
            DatagramPacket receivePacket=new DatagramPacket(receiveData,receiveData.length);
            clientsocket.receive(receivePacket);
            String serverDateandTime=new String(receivePacket.getData());
            System.out.println("From Server: "+serverDateandTime);
        }
    }

}
