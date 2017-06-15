package InetProgram;

import java.net.InetAddress;

/**
 * Created by suraz on 4/7/17.
 */
public class InetDemo {
    public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getByName("www.dwit.edu.np");

            System.out.println("Host name: " + ip.getHostName());
            System.out.println("Host name: " + ip.getHostAddress());

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
