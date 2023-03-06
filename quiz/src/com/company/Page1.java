package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Page1 implements ActionListener {

    int m = 0, n = 0;
    JFrame f1, p;
    JRadioButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10;
    JLabel l1;
    JButton b111;
    String ss1;


    Page1(JFrame f, String s1) {

        Color c1 = new Color(81, 150, 84);
        Color c2 = new Color(63, 132, 65);
        Color c3 = new Color(39, 86, 41);
        Color c4 = new Color(20, 68, 22);
        ButtonGroup g11 = new ButtonGroup();
        f1 = f;
        ss1 = s1;
        p = new JFrame("QUIZ");
        p.getContentPane().setBackground(c1);
        p.setVisible(true);
        p.setSize(2000, 2000);
        p.setLayout(new FlowLayout(FlowLayout.CENTER, 2000, 5));

        b1 = new JRadioButton("QUESTION 1");
        b2 = new JRadioButton("QUESTION 2");
        b3 = new JRadioButton("QUESTION 3");
        b4 = new JRadioButton("QUESTION 4");
        b5 = new JRadioButton("QUESTION 5");
        b6 = new JRadioButton("QUESTION 6");
        b7 = new JRadioButton("QUESTION 7");
        b8 = new JRadioButton("QUESTION 8");
        b9 = new JRadioButton("QUESTION 9");
        b10 = new JRadioButton("QUESTION 10");

        g11.add(b1);
        g11.add(b2);
        g11.add(b3);
        g11.add(b4);
        g11.add(b5);
        g11.add(b6);
        g11.add(b7);
        g11.add(b8);
        g11.add(b9);
        g11.add(b10);

        l1 = new JLabel("GOOD LUCK!");
        l1.setBackground(c4);
        l1.setForeground(c4);
        l1.setFont(new Font("cooper", Font.BOLD, 80));

        b111 = new JButton("SAVE");
        b1.setFont(new Font("casteller", Font.BOLD, 40));
        b2.setFont(new Font("casteller", Font.BOLD, 40));
        b3.setFont(new Font("casteller", Font.BOLD, 40));
        b4.setFont(new Font("casteller", Font.BOLD, 40));
        b5.setFont(new Font("casteller", Font.BOLD, 40));
        b6.setFont(new Font("casteller", Font.BOLD, 40));
        b7.setFont(new Font("casteller", Font.BOLD, 40));
        b8.setFont(new Font("casteller", Font.BOLD, 40));
        b9.setFont(new Font("casteller", Font.BOLD, 40));
        b10.setFont(new Font("casteller", Font.BOLD, 40));
        b111.setFont(new Font("casteller", Font.BOLD, 45));

        b1.setForeground(c4);
        b2.setForeground(c4);
        b3.setForeground(c4);
        b4.setForeground(c4);
        b5.setForeground(c4);
        b6.setForeground(c4);
        b7.setForeground(c4);
        b8.setForeground(c4);
        b9.setForeground(c4);
        b10.setForeground(c4);

        b1.setBackground(c1);
        b2.setBackground(c1);
        b3.setBackground(c1);
        b4.setBackground(c1);
        b5.setBackground(c1);
        b6.setBackground(c1);
        b7.setBackground(c1);
        b8.setBackground(c1);
        b9.setBackground(c1);
        b10.setBackground(c1);
        b111.setForeground(c3);

        p.add(l1);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(b10);
        p.add(b111);

        b111.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
    }


    public void actionPerformed(ActionEvent ae) {
            if (ae.getSource().equals(b1)) {
                p.setVisible(false);
                String question1 = new String("1. The range of indices for an array always start at:");
                String answer1 = "A. Whatever programmer specifies";
                String answer2 = "B. 1";
                String answer3 = "C. 0";
                String answer4 = "D. Size of array";
                new Question(p, m, n, f1, ss1, question1, answer1, answer2, answer3, answer4, answer3);
            }
            if (ae.getSource().equals(b2)) {
                p.setVisible(false);
                String question1 = new String("2. Which of the following is not a keyword in java?");
                String answer1 = "A. Static";
                String answer2 = "B. Boolean";
                String answer3 = "C. Void";
                String answer4 = "D. Private";
                new Question(p, m, n, f1, ss1, question1, answer1, answer2, answer3, answer4, answer2);

            }
            if (ae.getSource().equals(b3)) {
                p.setVisible(false);
                String question1 = new String("3. What is the default value of byte variable?");
                String answer1 = "A. 0";
                String answer2 = "B. 0.0";
                String answer3 = "C. null";
                String answer4 = "D. undefined";
                new Question(p, m, n, f1, ss1, question1, answer1, answer2, answer3, answer4, answer1);
            }
            if (ae.getSource().equals(b4)) {
                p.setVisible(false);
                String question1 = new String("4. What is class variable?");
                String answer1 = "A. Class variables are static variables within a class but outside any method.";
                String answer2 = "B. Class variables are variables defined inside methods, constructors or blocks.";
                String answer3 = "C. Class variables are variables within a class but outside any method.";
                String answer4 = "D. None of the above.";
                new Question(p, m, n, f1, ss1, question1, answer1, answer2, answer3, answer4, answer1);
            }
            if (ae.getSource().equals(b5)) {
                p.setVisible(false);
                String question1 = new String("5. What is function overloading?");
                String answer1 = "A. Methods with same name but different parameters.";
                String answer2 = "B. Methods with same name but different return types.";
                String answer3 = "C. Methods with same name, same parameter types but different parameter names.";
                String answer4 = "D. None of the above.";
                new Question(p, m, n, f1, ss1, question1, answer1, answer2, answer3, answer4, answer1);
            }
            if (ae.getSource().equals(b6)) {
                p.setVisible(false);
                String question1 = new String("6. What is currentThread()?");
                String answer1 = "A. It is a Thread public static method used to obtain a reference to the current thread.";
                String answer2 = "B. It is a thread's instance method used to get thread count.";
                String answer3 = "C. It is a object's public static method used obtain a reference to the current thread.";
                String answer4 = "D. It is a object's instance method used to get thread count.";
                new Question(p, m, n, f1, ss1, question1, answer1, answer2, answer3, answer4, answer1);
            }
            if (ae.getSource().equals(b7)) {
                p.setVisible(false);
                String question1 = new String("7. Which is not a part of defining an object?");
                String answer1 = "A. Description";
                String answer2 = "B. Methods";
                String answer3 = "C. Associations with other objects";
                String answer4 = "D. Name";
                new Question(p, m, n, f1, ss1, question1, answer1, answer2, answer3, answer4, answer1);
            }
            if (ae.getSource().equals(b8)) {
                p.setVisible(false);
                String question1 = new String("8. Which one could be used as the main container in a Java application?");
                String answer1 = "A. JApplet";
                String answer2 = "B. JFrame";
                String answer3 = "C. JPanel";
                String answer4 = "D. JButton";
                new Question(p, m, n, f1, ss1, question1, answer1, answer2, answer3, answer4, answer2);
            }
            if (ae.getSource().equals(b9)) {
                p.setVisible(false);
                String question1 = new String("9. What is the difference between private and public functions?");
                String answer1 = "A. Public functions are free, you have to buy private ones";
                String answer2 = "B. Public functions are the only ones you can download";
                String answer3 = "C. Public functions can be used by anyone, private can only be used by other code in the class you are writing";
                String answer4 = "D. Public functions can’t be used";
                new Question(p, m, n, f1, ss1, question1, answer1, answer2, answer3, answer4, answer3);
            }
            if (ae.getSource().equals(b10)) {
                p.setVisible(false);
                String question1 = new String("10. What is the keyword used in java to create an object?");
                String answer1 = "A. This";
                String answer2 = "B. New";
                String answer3 = "C. Sync";
                String answer4 = "D. New()";
                new Question(p, m, n, f1, ss1, question1, answer1, answer2, answer3, answer4, answer2);
            }


            if (ae.getSource().equals(b111)) {
                p.setVisible(false);
                JOptionPane.showMessageDialog(null, "Saved successfully");
                JOptionPane.showMessageDialog(null, "Player " + ss1 + " has reached " + m + " points");
                int n = JOptionPane.showConfirmDialog(p, "Would you like to start another quiz?", "Quiz", JOptionPane.YES_NO_OPTION);
                if (n == JOptionPane.YES_OPTION)
                    new Quiz();
                else p.setVisible(false);
            }
        }

    public void marks(int m1, int n1) {
        m = m + m1;
        n = n + n1;
    }

}