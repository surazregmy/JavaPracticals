package MultiClient;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by suraz on 4/21/17.
 */
public class TCPServer {
    public static void main(String[] args) throws Exception {
        try {
            ServerSocket listenSocket = new ServerSocket(7896);
            System.out.println("Server Started");
            while (true) {
                Socket clientSocket = listenSocket.accept();
                Myconnection conn = new Myconnection(clientSocket);
            }
        } catch (IOException e) {
        }

    }
}

