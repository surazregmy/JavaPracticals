package UDPServerPack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * Created by suraz on 4/20/17.
 */
public class UDPClient {
    public static void main(String[] args) throws Exception{
        BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
        //create client socket
        DatagramSocket clientsocket = new DatagramSocket();

        //Translate hostname to IP address usin DNS
        InetAddress IPAdress = InetAddress.getByName("localhost");

        byte[] sendData = new byte[100];
        byte[] receiveData = new byte[100];


        System.out.println("Enter the name");
        String sentence = inFromUser.readLine();
        sendData = sentence.getBytes();

        DatagramPacket sendPaceket = new DatagramPacket(sendData,sendData.length, IPAdress, 9865);
        clientsocket.send(sendPaceket);

        DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
        clientsocket.receive(receivePacket);

        String modifiedSentence = new String(receivePacket.getData());
        System.out.println("FROM SERVER "+ modifiedSentence);
        clientsocket.close();
    }
}
