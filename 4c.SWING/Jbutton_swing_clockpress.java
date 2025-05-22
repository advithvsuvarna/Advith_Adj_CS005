package Swing;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Jbutton_swing_clockpress{
    JLabel lbl;

    Jbutton_swing_clockpress() {
        JFrame f = new JFrame("Image Button Example");

        lbl = new JLabel();
        lbl.setBounds(50, 50, 400, 100);
        lbl.setFont(new Font("Arial", Font.BOLD, 24));

        ImageIcon icon1 = new ImageIcon(getClass().getResource("digital_clock.png"));
        ImageIcon icon2 = new ImageIcon(getClass().getResource("hour_glass.png"));


        JButton b1 = new JButton(icon1);
        JButton b2 = new JButton(icon2);

        b1.setBounds(100, 200, 100, 100);
        b2.setBounds(250, 200, 100, 100);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lbl.setText("Digital Clock is pressed");
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lbl.setText("Hour Glass is pressed");
            }
        });

      
        f.add(b1);
        f.add(b2);
        f.add(lbl);

        f.setSize(500, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Jbutton_swing_clockpress();
    }
}


