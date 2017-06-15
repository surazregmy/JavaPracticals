package ClientServerGUI;

import java.io.DataInputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by suraz on 4/7/17.
 */
public class TCPServer {
    public static void main(String[] args) throws Exception {
        ServerSocket ser = new ServerSocket(1234);  //DOnt use less than 1024

        while (true){
            System.out.println("Server is waiting.........");

            Socket s = ser.accept();               //Accepting Connnection
//
//            Scanner in = new Scanner(System.in);
//            String input = in.nextLine();
            DataInputStream dis = new DataInputStream(s.getInputStream());

            PrintStream ps = new PrintStream(s.getOutputStream());

            String message = dis.readLine();

            System.out.println("The received message is "+ message);
            ps.println("From Server "+ message.toUpperCase());
        }



    }
}
