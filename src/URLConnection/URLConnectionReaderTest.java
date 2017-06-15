package URLConnection;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by suraz on 4/20/17.
 */
public class URLConnectionReaderTest {
    public static void main(String[] args) throws Exception{
        String inputLine;
        URL yahoo = new URL("https://www.yahoo.com/");
        URLConnection yc = yahoo.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));

        while ((inputLine = in.readLine())!= null){
            System.out.println(inputLine);
        }
            in.close();

    }
}


