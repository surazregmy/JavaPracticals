package ClientServerGUI;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by suraz on 4/27/17.
 */
public class ClientGUI extends JFrame{
    JTextField txt1, txt2, txt3, txt4;
    JButton btncancel, btnconnect;

    public ClientGUI(String title){
        super(title);

        setLayout( new GridLayout(4,2));
        JLabel lab1 = new JLabel("IP Address");
        JLabel lab2 = new JLabel("Port");
        JLabel lab3 = new JLabel("cancel");
        JLabel lab4= new JLabel("connect");

        txt1 = new JTextField(100);
        txt2 = new JTextField(100);

        btncancel = new JButton("cancel");
        btnconnect = new JButton("connect");

        add(lab1);
        add(txt1);
        add(lab2);
        add(txt2);
        add(btncancel);
        add(btnconnect);

        ButtonEvent handler = new ButtonEvent();
        btncancel.addActionListener(handler);
        btnconnect.addActionListener(handler);




    }
    public class ButtonEvent implements ActionListener{
        public void actionPerformed(ActionEvent ae) {
            Object source = ae.getSource();

            String IPaddress = txt1.getText();
            String port =txt2.getText();

            if(source == btnconnect){

                JFrame frm = new ClientGUI2(IPaddress,port);
                frm.setSize(300,100);
                frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frm.setVisible(true);
            }
            else if (source == btncancel){
                System.exit(0);

            }

        }
    }
}
