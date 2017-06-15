package ClientServerMessageInOneSecond;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Date;

/**
 * Created by suraz on 4/21/17.
 */
public class Server {
    public static void main(String args[]) throws Exception
    {
        DatagramSocket serverSocket = new DatagramSocket(9876);
        byte[] receiveData = new byte[1024];

        DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
        serverSocket.receive(receivePacket);
        InetAddress IPAddress = receivePacket.getAddress();
        int port = receivePacket.getPort();


        while (true)
        {
            Thread.sleep(1000);
            byte[] sendData = new byte[1024];
            Date date = new Date();
//            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("DD/MM/YYYY HH:MM:SS");
            String stringDate = date.toString();
            sendData = stringDate.getBytes();
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, port);
            serverSocket.send(sendPacket);
        }
    }
}
