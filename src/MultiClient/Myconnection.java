package MultiClient;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * Created by suraz on 4/21/17.
 */
public class Myconnection extends Thread{
    DataInputStream dis;
    DataOutputStream dos;
    Socket clientSocket;

     Myconnection(Socket aClientSocket){
        clientSocket = aClientSocket;
        try {
            dis = new DataInputStream(clientSocket.getInputStream());
            dos = new DataOutputStream(clientSocket.getOutputStream());
            this.start();
        }
        catch (IOException e){
            System.out.println(e.getMessage());

        }

    }
    public void run(){
        String login;
        try {
            for (;;){ //Infinite or True WHile True
                String data = dis.readUTF();
                dos.writeUTF("From Server :"+data);
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
        finally {
            try {
                clientSocket.close();
            }
            catch (IOException o){
                System.out.println(o.getMessage());
            }
        }

    }
}
