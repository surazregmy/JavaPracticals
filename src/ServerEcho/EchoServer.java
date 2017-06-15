package ServerEcho;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by suraz on 4/7/17.
 */
public class EchoServer {
    public EchoServer(int portnum)
    {
        try
        {
            server = new ServerSocket(portnum);
        }
        catch (Exception err)
        {
            System.out.println(err);
        }
    }

    public void serve()
    {
        try
        {
            while (true)
            {
                Socket client = server.accept();
                BufferedReader r = new BufferedReader(new InputStreamReader(client.getInputStream()));
                PrintWriter w = new PrintWriter(client.getOutputStream(), true);
                w.println("Welcome to the Java EchoServer.  Type 'quit' to close.");
                String line;
                do
                {
                    line = r.readLine();
                    if ( line != null )
                        w.println("Got: "+ line);
                }
                while ( !line.trim().equals("quit") );
                client.close();
            }
        }
        catch (Exception err)
        {
            System.err.println(err);
        }
    }

    public static void main(String[] args)
    {
        EchoServer s = new EchoServer(9999);
        s.serve();
    }

    private ServerSocket server;
}
