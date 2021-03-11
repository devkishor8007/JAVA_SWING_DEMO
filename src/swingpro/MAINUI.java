/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingpro;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Kishor Kc
 */
public class MAINUI {

    public static void main(String[] args) {
        SWING s = new SWING();
    }

}

class SWING extends JFrame {

    public SWING() {
        JFrame j = new JFrame("SWING_DEMO_JAVA");
        j.setBounds(50, 50, 800, 400);
        j.setResizable(false);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = j.getContentPane();
        c.setLayout(null);

        JLabel l = new JLabel("Namaste");
        l.setBounds(20, 10, 60, 10);
        c.add(l);

        JLabel l2 = new JLabel("My name is Kishor Kc");
        l2.setBounds(20, 30, 200, 15);
        c.add(l2);

        JTextField t = new JTextField("Username");
        t.setBounds(20, 55, 200, 20);
        c.add(t);

        JPasswordField p = new JPasswordField("Password");
        p.setBounds(20, 80, 200, 20);
        c.add(p);

        JButton b = new JButton("OK");
        b.setBounds(20, 105, 60, 20);
        c.add(b);

        JRadioButton rb = new JRadioButton("Male");
        JRadioButton rb1 = new JRadioButton("Female");
        JRadioButton rb2 = new JRadioButton("Other");
        rb.setBounds(20, 127, 60, 20);
        rb1.setBounds(20, 145, 90, 20);
        rb2.setBounds(20, 165, 60, 20);

        c.add(rb);
        c.add(rb1);
        c.add(rb2);

        String text = "<html><p>Java Swing tutorial is a part of Java Foundation Classes (JFC) that is used to create window-based applications. It is built on the top of AWT (Abstract Windowing Toolkit) API and entirely written in java.\n"
                + "\n"
                + "Unlike AWT, Java Swing provides platform-independent and lightweight components.\n"
                + "\n"
                + "The javax.swing package provides classes for java swing API such as JFrame, JButton, JTextField, JLabel, JRadioButton, JPasswordField etc.</p></html>";
        JLabel info = new JLabel(text);
        info.setBounds(20, 190, 700, 60);
        c.add(info);

        j.setVisible(true);

    }
}
