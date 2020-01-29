package com.prashant;

import java.awt.event.*;
import javax.swing.*;

public class LoginForm implements ActionListener
{
    JFrame f;
    JLabel l1,l2;
    JTextField t;
    JPasswordField p;
    JButton b1,b2;
    JLabel label_1,label_2;

    LoginForm()
    {
        f = new JFrame("Login Form using Java Swing");

        l1 = new JLabel("Username : ");
        l1.setBounds(20,20,80,25);
        f.add(l1);

        t = new JTextField();
        t.setBounds(100,20,160,25);
        f.add(t);

        l2 = new JLabel("Password : ");
        l2.setBounds(20,60,80,25);
        f.add(l2);

        p = new JPasswordField();
        p.setBounds(100,60,160,25);
        f.add(p);

        b1 = new JButton("Login");
        b1.setBounds(40,100,80,30);
        f.add(b1);

        b2 = new JButton("Exit");
        b2.setBounds(200,100,80,30);
        f.add(b2);

        label_1 = new JLabel();
        label_1.setBounds(50,150,400,40);
        f.add(label_1);

        label_2 = new JLabel();
        label_2.setBounds(50,170,400,40);
        f.add(label_2);

        b1.addActionListener(this);
        b2.addActionListener(this);

        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae)
    {
        String user = t.getText();
        String pass = p.getText();
        if(ae.getActionCommand() == "Login")
        {
            label_1.setText("Your Username is : " + user);
            label_2.setText("Your Password is : " + pass);
        }
        else if(ae.getActionCommand() == "Exit")
        {
            System.exit(0);
        }
    }

    public static void main(String args [])
    {
        new LoginForm();
    }
}
