package Calculator;

import javax.swing.*;

/**
 * Created by suraz on 6/15/17.
 */
public class Main {
    public static void main(String[] args) {
        JFrame frm = new MiniCalculator("Mini Calculator");
        frm.setSize(300,100);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setVisible(true);
    }
}
