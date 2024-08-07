package com.cug.test;

import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

public class GetText extends JFrame {

    private JButton bt = new JButton("click");

    private JTextField

// t1=new JTextField(10),

            t2 = new JTextField(10);

    private JTextArea t1 = new JTextArea(10, 20);

    public GetText() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(200, 100);

        setVisible(true);

        setLayout(new FlowLayout());

// add(bt);

// add(t1);

        add(new JScrollPane(t1));

        add(bt);

        add(t2);

        bt.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                t2.setText(t1.getText());

            }

        });

    }

    public static void main(String[] args) {

        new GetText();

    }

}