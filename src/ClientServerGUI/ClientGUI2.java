package ClientServerGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;

/**
 * Created by suraz on 4/27/17.
 */
public class ClientGUI2 extends JFrame{

    JTextField txt1;
    JButton btncancel, btnsend;
    String ip;
    int port;

    public ClientGUI2(String title,String port){
        super(title);
        this.ip = title;
        this.port = Integer.parseInt(port);

        setLayout( new GridLayout(4,2));
        JLabel lab1 = new JLabel("Message");

        JLabel lab3 = new JLabel("cancel");
        JLabel lab4= new JLabel("Send");

        txt1 = new JTextField(100);


        btncancel = new JButton("cancel");
        btnsend = new JButton("send");

        add(lab1);
        add(txt1);

        add(btncancel);
        add(btnsend);

        ButtonEvent2 handler = new ButtonEvent2();
        btncancel.addActionListener(handler);
        btnsend.addActionListener(handler);


    }
    public class ButtonEvent2 implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            Object source = ae.getSource();

            String IPaddress = txt1.getText();


            if(source == btnsend){

                try {
                   // Socket soc = null;
                    Socket soc = new Socket(ip,port);
                    DataInputStream dis = new DataInputStream(soc.getInputStream());

                    PrintStream ps = new PrintStream(soc.getOutputStream());
                    String message =txt1.getText();

                    ps.println(message);
                    message = dis.readLine();
                    System.out.println(message);
                    soc.close();

                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            else if (source == btncancel){
                System.exit(0);

            }

        }
    }
}
