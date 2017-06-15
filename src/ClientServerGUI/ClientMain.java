package ClientServerGUI;

import javax.swing.*;

/**
 * Created by suraz on 4/27/17.
 */
public class ClientMain {
    public static void main(String[] args) {
        JFrame frm = new ClientGUI("Connection");
        frm.setSize(300,100);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setVisible(true);
    }
}
