package NetworkProgramming;

import java.io.DataInputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by suraz on 4/7/17.
 */
public class TCPClient {
    public static void main(String[] args) throws Exception {
        Socket soc = new Socket("localhost",1234);
        DataInputStream dis = new DataInputStream(soc.getInputStream());

        PrintStream ps = new PrintStream(soc.getOutputStream());
        String message ="Happy new YEAR 2074!";

        ps.println(message);
        message = dis.readLine();
        System.out.println(message);
        soc.close();
    }
}
