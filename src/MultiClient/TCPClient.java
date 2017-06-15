package MultiClient;

import java.io.*;
import java.net.Socket;

/**
 * Created by suraz on 4/21/17.
 */
public class TCPClient {
    public static void main(String[] args) throws Exception {
        String str1, str2 = " ";
        try {
            Socket soc = new Socket("localhost",7896);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            DataInputStream dis = new DataInputStream(soc.getInputStream());
            DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
            boolean flag = true;
            System.out.println("Typpe Message : Type Bye to Quit");
            while (flag){
                try {
                    str1 = br.readLine();
                    if(str1.trim().equals("Bye")) flag = false;
                    else {
                        dos.writeUTF(str1);
                        System.out.println(dis.readUTF());
                    }
                }
                catch (IOException e){
                    System.out.println(e.getMessage());
                }

            }
        }
        catch (IOException ioe){
            System.out.println(ioe.getMessage());
        }
    }
}
