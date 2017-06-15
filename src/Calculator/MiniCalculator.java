package Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by suraz on 6/15/17.
 */
public class MiniCalculator  extends JFrame{
    JTextField txt1, txt2, txt3;
    JButton btnAdd, btnSub;

    public MiniCalculator(String title){
        super(title);
        setLayout(new GridLayout(4,2));
        JLabel lbl1 = new JLabel("Number1");
        JLabel lbl2 = new JLabel("Number2");
        JLabel lbl3 = new JLabel("Result");

        txt1 = new JTextField(40);
        txt2 = new JTextField(40);
        txt3 = new JTextField(40);

        btnAdd = new JButton("+");
        btnSub = new JButton("-");

        add(lbl1);
        add(txt1);
        add(lbl2);
        add(txt2);
        add(lbl3);
        add(txt3);
        add(btnAdd);
        add(btnSub);

        ButtonEvent handler = new ButtonEvent();
        btnAdd.addActionListener(handler);
        btnSub.addActionListener(handler);

    }
    public class ButtonEvent implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent ae) {
            Object source  = ae.getSource();
            int a = Integer.parseInt(txt1.getText());
            int b = Integer.parseInt(txt2.getText());

            int result = 0;

            if(source == btnAdd){
                result = a+b;
            }

            if(source == btnSub){
                result = a-b;
            }

            txt3.setText(String.valueOf(result));
        }
    }
}
