package UDPServerPack;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * Created by suraz on 4/20/17.
 */
public class UDPServer {
    public static void main(String[] args) throws Exception{

        DatagramSocket serverSocket = new DatagramSocket(9865);

        byte[] sendData = new byte[100];
        byte[] receiveData = new byte[100];

        while(true)
        {
            //create space for the received datagram
            DatagramPacket receivePacket = new DatagramPacket(receiveData,receiveData.length);

            //receive the datagram
            serverSocket.receive(receivePacket);

            String sentence = new String(receivePacket.getData());

            //get IP address and port number of sender
            InetAddress IPAddress = receivePacket.getAddress();
            int port = receivePacket.getPort();
            String capitalizedSentence = sentence.toUpperCase();
            sendData = capitalizedSentence.getBytes();

            //create datagram to send to client
            DatagramPacket sendPacket = new DatagramPacket(sendData,sendData.length,IPAddress,port);
            //write out the datagram to the socket
            serverSocket.send(sendPacket);
        }//end while loop


        }



}
