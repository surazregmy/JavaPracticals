package InetTest;

import java.net.*;
import java.net.UnknownHostException;

/**
 * Created by suraz on 4/20/17.
 */
public class InetAddressTest {
    public static void main(String[] args) throws UnknownHostException{

        InetAddress Address = InetAddress.getLocalHost() ;// Get local host
        System.out.println(Address);

        Address = InetAddress.getByName("yahoo.com");  //Obtain the Ip Addess of yahoo.com
        System.out.println(Address);

        Address = InetAddress.getByName("google.com");
        System.out.println(Address);

        Address = InetAddress.getByName("hotmail.com");
        System.out.println(Address);

        InetAddress sw[] = InetAddress.getAllByName("www.nba.com"); // returns arrayy of InetAddress

        for(int i = 0; i < sw.length; i++){
            System.out.println(sw[i]);
        }







    }
}
