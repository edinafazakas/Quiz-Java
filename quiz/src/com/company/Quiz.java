package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Color;
class Quiz implements ActionListener
{
    JFrame f;
    JLabel l1,l2,l4,l5,l6;
    JTextField t1,t2;
    JButton b1,b2,b3,b4;

    Quiz()
    {
        Color c1 = new Color(81, 150, 84);
        Color c2 = new Color(63, 132, 65);
        Color c3 = new Color(39, 86, 41);
        Color c4 = new Color(20, 68, 22);
        f = new JFrame("QUIZ");
        f.getContentPane().setBackground(c1);
        f.setVisible(true);
        f.setSize(2000,2000);
        f.setLayout(new FlowLayout(FlowLayout.CENTER,2000,25));
        JLabel ll=new JLabel(new ImageIcon("mits1.JPEG"));
        l1 = new JLabel("WELCOME TO QUIZ");
        b1 = new JButton("GOOD LUCK!");
        b2 = new JButton("Instructions");
        l2 = new JLabel("NAME:");
        t1 = new JTextField(15);
        b3 = new JButton("START");
        b4 = new JButton("CANCEL");
        l4 = new JLabel("1. Every question has 10 points, you can reach 100 points in total");
        l6 = new JLabel("3. Good luck! :)");
        l5 = new JLabel("2. Every question has 1 answer from A to D");
        //b1.setForeground(Color.(255,20,147);
        b1.setBackground(c2);
        b1.setForeground(c4);
        b3.setBackground(c3);
        b4.setBackground(c3);
        l1.setFont(new Font("cooper",Font.BOLD,60));
        b1.setFont(new Font("casteller",Font.BOLD,50));
        b2.setFont(new Font("cooper",Font.BOLD,35));
        b3.setFont(new Font("cooper",Font.BOLD,25));
        b4.setFont(new Font("cooper",Font.BOLD,25));
        l4.setFont(new Font("casteller",Font.BOLD,35));
        l5.setFont(new Font("casteller",Font.BOLD,35));
        l6.setFont(new Font("casteller",Font.BOLD,35));
        l2.setFont(new Font("casteller",Font.BOLD,45));
        f.add(ll);
        f.add(l1);
        f.add(b1);
        f.add(b2);
        f.add(l4);
        f.add(l5);
        f.add(l6);
        f.add(l2);
        f.add(t1);
        f.add(b3);
        f.add(b4);
        b3.addActionListener(this);
        b4.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource().equals(b3))
        {
            try
            {
                String s1 = t1.getText();
                if(t1.getText().equals(""))
                {JOptionPane.showMessageDialog(null,"Player name required");}
                else
                {
                    f.setVisible(false);
                    new Page1(f,s1);
                }
            }
            finally
            {}
        }
        else
        {
            f.setVisible(false);
        }
    }
    public static void main(String[] args)
    {
        new Quiz();
    }
}