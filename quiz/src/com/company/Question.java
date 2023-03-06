package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Question implements ActionListener
{
    int m1, n1;
    String sss1;
    JFrame f2,q;
    JLabel l1;
    JRadioButton b1,b2,b3,b4,correct1;
    JButton b5, b6, b7, b8;
    String answer11, answer12, answer13, answer14;
    Question(JFrame f, int m, int n,  JFrame f1, String ss1, String question, String answer1, String answer2, String answer3, String answer4, String correct)
    {
        Color c1 = new Color(81, 150, 84);
        Color c2 = new Color(175, 250, 177);
        Color c3 = new Color(24, 47, 25);
        Color c4 = new Color(20, 68, 22);
        m1 = m;
        n1 = n;
        f2 = f;
        sss1 = ss1;
        q = new JFrame("Question");
        q.getContentPane().setBackground(c1);
        ButtonGroup j=new ButtonGroup();
        JLabel ll = new JLabel(new ImageIcon("ram.JPEG"));
        l1 = new JLabel(question);
        b1 = new JRadioButton(answer1);
        b2 = new JRadioButton(answer2);
        b3 = new JRadioButton(answer3);
        b4 = new JRadioButton(answer4);
        if(correct.equals(answer1))
            correct1 = b1;
        else if(correct.equals(answer2))
            correct1 = b2;
        else if(correct.equals(answer3))
            correct1 = b3;
        else if(correct.equals(answer4))
            correct1 = b4;

        answer11 = answer1;
        answer12 = answer2;
        answer13 = answer3;
        answer14 = answer4;

        b5 = new JButton("SAVE ANSWER");
        b6 = new JButton("PREVIOUS");
        b7 = new JButton("NEXT");
        b8 = new JButton("FIRST PAGE");

        l1.setFont(new Font("cooper",Font.BOLD,55));
        b1.setFont(new Font("casteller",Font.BOLD,30));
        b2.setFont(new Font("casteller",Font.BOLD,30));
        b3.setFont(new Font("casteller",Font.BOLD,30));
        b4.setFont(new Font("casteller",Font.BOLD,30));
        b5.setFont(new Font("cooper",Font.BOLD,45));
        b6.setFont(new Font("cooper",Font.BOLD,45));
        b7.setFont(new Font("cooper",Font.BOLD,45));
        b8.setFont(new Font("cooper",Font.BOLD,45));

        q.setVisible(true);
        q.setSize(2000,2000);
        q.setLayout(new FlowLayout(FlowLayout.CENTER,2500,20));
        q.add(ll);

        b1.setForeground(c4);
        l1.setForeground(c3);
        b2.setForeground(c4);
        b3.setForeground(c4);
        b4.setForeground(c4);

        b1.setBackground(c2);
        b2.setBackground(c2);
        b3.setBackground(c2);
        b4.setBackground(c2);
        b5.setBackground(c2);
        b6.setBackground(c2);
        b7.setBackground(c2);
        b8.setBackground(c2);

        j.add(b1);
        j.add(b2);
        j.add(b3);
        j.add(b4);

        q.add(l1);
        q.add(b1);
        q.add(b2);
        q.add(b3);
        q.add(b4);
        q.add(b5);
        q.add(b6);
        q.add(b7);
        q.add(b8);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource().equals(b5))
        {
            n1 = n1 + 1;
            if(correct1.isSelected())
                m1 = m1 + 10;
            JOptionPane.showMessageDialog(null,"Player " + sss1 + " has currently " + m1 + " points\n" + n1 +" questions answered already");
        }

        if(e.getSource().equals(b8))
        {
            q.setVisible(false);
            Page1 k=new Page1(f2,sss1);
            k.marks(m1, n1);
        }


        if(e.getSource().equals(b6))
        {
           if(answer11.equals("A. Whatever programmer specifies")) {
               //JOptionPane.showMessageDialog(null,"Player " + sss1 + " has currently " + m1 + " points\n" + n1 +" questions answered already");
           }

            else if(answer11.equals("A. Static")) {
               q.setVisible(false);
               String question1 = new String("1. The range of indices for an array always start at:");
               String answer1 = "A. Whatever programmer specifies";
               String answer2 = "B. 1";
               String answer3 = "C. 0";
               String answer4 = "D. Size of array";
               new Question(q, m1, n1, f2, sss1, question1, answer1, answer2, answer3, answer4, answer3);
           }
           else if(answer11.equals("A. 0")) {
               q.setVisible(false);
               String question1 = new String("2. Which of the following is not a keyword in java?");
               String answer1 = "A. Static";
               String answer2 = "B. Boolean";
               String answer3 = "C. Void";
               String answer4 = "D. Private";
               new Question(q, m1, n1, f2, sss1, question1, answer1, answer2, answer3, answer4, answer2);
           }
           else if(answer11.equals("A. Class variables are static variables within a class but outside any method.")) {
               q.setVisible(false);
               String question1 = new String("3. What is the default value of byte variable?");
               String answer1 = "A. 0";
               String answer2 = "B. 0.0";
               String answer3 = "C. null";
               String answer4 = "D. undefined";
               new Question(q, m1, n1, f2, sss1, question1, answer1, answer2, answer3, answer4, answer1);
           }
           else if(answer11.equals("A. Methods with same name but different parameters.")) {
               q.setVisible(false);
               String question1 = new String("4. What is class variable?");
               String answer1 = "A. Class variables are static variables within a class but outside any method.";
               String answer2 = "B. Class variables are variables defined inside methods, constructors or blocks.";
               String answer3 = "C. Class variables are variables within a class but outside any method.";
               String answer4 = "D. None of the above.";
               new Question(q, m1, n1, f2, sss1, question1, answer1, answer2, answer3, answer4, answer1);
           }

           else if(answer11.equals("A. It is a Thread public static method used to obtain a reference to the current thread.")) {
               q.setVisible(false);
               String question1 = new String("5. What is function overloading?");
               String answer1 = "A. Methods with same name but different parameters.";
               String answer2 = "B. Methods with same name but different return types.";
               String answer3 = "C. Methods with same name, same parameter types but different parameter names.";
               String answer4 = "D. None of the above.";
               new Question(q, m1, n1, f2, sss1, question1, answer1, answer2, answer3, answer4, answer1);
           }

           else if(answer11.equals("A. Description")) {
               q.setVisible(false);
               String question1 = new String("6. What is currentThread()?");
               String answer1 = "A. It is a Thread public static method used to obtain a reference to the current thread.";
               String answer2 = "B. It is a thread's instance method used to get thread count.";
               String answer3 = "C. It is a object's public static method used obtain a reference to the current thread.";
               String answer4 = "D. It is a object's instance method used to get thread count.";
               new Question(q, m1, n1, f2, sss1, question1, answer1, answer2, answer3, answer4, answer1);
           }

           else if(answer11.equals("A. JApplet")) {
               q.setVisible(false);
               String question1 = new String("7. Which is not a part of defining an object?");
               String answer1 = "A. Description";
               String answer2 = "B. Methods";
               String answer3 = "C. Associations with other objects";
               String answer4 = "D. Name";
               new Question(q, m1, n1, f2, sss1, question1, answer1, answer2, answer3, answer4, answer1);
           }

           else if(answer11.equals("A. Public functions are free, you have to buy private ones")) {
               q.setVisible(false);
               String question1 = new String("8. Which one could be used as the main container in a Java application?");
               String answer1 = "A. JApplet";
               String answer2 = "B. JFrame";
               String answer3 = "C. JPanel";
               String answer4 = "D. JButton";
               new Question(q, m1, n1, f2, sss1, question1, answer1, answer2, answer3, answer4, answer2);
           }

           else if(answer11.equals("A. This")) {
               q.setVisible(false);
               String question1 = new String("9. What is the difference between private and public functions?");
               String answer1 = "A. Public functions are free, you have to buy private ones";
               String answer2 = "B. Public functions are the only ones you can download";
               String answer3 = "C. Public functions can be used by anyone, private can only be used by other code in the class you are writing";
               String answer4 = "D. Public functions can’t be used";
               new Question(q, m1, n1, f2, sss1, question1, answer1, answer2, answer3, answer4, answer3);
           }
        }



        if(e.getSource().equals(b7))
        {
            if(answer11.equals("A. Whatever programmer specifies")) {
                q.setVisible(false);
                String question1 = new String("2. Which of the following is not a keyword in java?");
                String answer1 = "A. Static";
                String answer2 = "B. Boolean";
                String answer3 = "C. Void";
                String answer4 = "D. Private";
                new Question(q, m1, n1, f2, sss1, question1, answer1, answer2, answer3, answer4, answer2);
            }

            else if(answer11.equals("A. Static")) {
                q.setVisible(false);
                String question1 = new String("3. What is the default value of byte variable?");
                String answer1 = "A. 0";
                String answer2 = "B. 0.0";
                String answer3 = "C. null";
                String answer4 = "D. undefined";
                new Question(q, m1, n1, f2, sss1, question1, answer1, answer2, answer3, answer4, answer1);
            }
            else if(answer11.equals("A. 0")) {
                q.setVisible(false);
                String question1 = new String("4. What is class variable?");
                String answer1 = "A. Class variables are static variables within a class but outside any method.";
                String answer2 = "B. Class variables are variables defined inside methods, constructors or blocks.";
                String answer3 = "C. Class variables are variables within a class but outside any method.";
                String answer4 = "D. None of the above.";
                new Question(q, m1, n1, f2, sss1, question1, answer1, answer2, answer3, answer4, answer1);
            }
            else if(answer11.equals("A. Class variables are static variables within a class but outside any method.")) {
                q.setVisible(false);
                String question1 = new String("5. What is function overloading?");
                String answer1 = "A. Methods with same name but different parameters.";
                String answer2 = "B. Methods with same name but different return types.";
                String answer3 = "C. Methods with same name, same parameter types but different parameter names.";
                String answer4 = "D. None of the above.";
                new Question(q, m1, n1, f2, sss1, question1, answer1, answer2, answer3, answer4, answer1);
            }
            else if(answer11.equals("A. Methods with same name but different parameters.")) {
                q.setVisible(false);
                String question1 = new String("6. What is currentThread()?");
                String answer1 = "A. It is a Thread public static method used to obtain a reference to the current thread.";
                String answer2 = "B. It is a thread's instance method used to get thread count.";
                String answer3 = "C. It is a object's public static method used obtain a reference to the current thread.";
                String answer4 = "D. It is a object's instance method used to get thread count.";
                new Question(q, m1, n1, f2, sss1, question1, answer1, answer2, answer3, answer4, answer1);
            }

            else if(answer11.equals("A. It is a Thread public static method used to obtain a reference to the current thread.")) {
                q.setVisible(false);
                String question1 = new String("7. Which is not a part of defining an object?");
                String answer1 = "A. Description";
                String answer2 = "B. Methods";
                String answer3 = "C. Associations with other objects";
                String answer4 = "D. Name";
                new Question(q, m1, n1, f2, sss1, question1, answer1, answer2, answer3, answer4, answer1);
            }

            else if(answer11.equals("A. Description")) {
                q.setVisible(false);
                String question1 = new String("8. Which one could be used as the main container in a Java application?");
                String answer1 = "A. JApplet";
                String answer2 = "B. JFrame";
                String answer3 = "C. JPanel";
                String answer4 = "D. JButton";
                new Question(q, m1, n1, f2, sss1, question1, answer1, answer2, answer3, answer4, answer2);
            }

            else if(answer11.equals("A. JApplet")) {
                q.setVisible(false);
                String question1 = new String("9. What is the difference between private and public functions?");
                String answer1 = "A. Public functions are free, you have to buy private ones";
                String answer2 = "B. Public functions are the only ones you can download";
                String answer3 = "C. Public functions can be used by anyone, private can only be used by other code in the class you are writing";
                String answer4 = "D. Public functions can’t be used";
                new Question(q, m1, n1, f2, sss1, question1, answer1, answer2, answer3, answer4, answer3);
            }

            else if(answer11.equals("A. Public functions are free, you have to buy private ones")) {
                q.setVisible(false);
                String question1 = new String("10. What is the keyword used in java to create an object?");
                String answer1 = "A. This";
                String answer2 = "B. New";
                String answer3 = "C. Sync";
                String answer4 = "D. New()";
                new Question(q, m1, n1, f2, sss1, question1, answer1, answer2, answer3, answer4, answer2);
            }

            else if(answer11.equals("A. This")) {
                q.setVisible(false);
                JOptionPane.showMessageDialog(null,"Saved successfully");
                JOptionPane.showMessageDialog(null,"Player " + sss1 + " has reached " + m1 + " points");
                int n = JOptionPane.showConfirmDialog(q, "Would you like to start another quiz?", "Quiz", JOptionPane.YES_NO_OPTION);
                if(n == JOptionPane.YES_OPTION)
                    new Quiz();
                else q.setVisible(false);
            }
        }
    }
}