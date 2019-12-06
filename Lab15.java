//package com.tutorialspoint.gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.plaf.basic.BasicOptionPaneUI;

public class Lab15 {
    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;
    private JPanel loginPanel;
    private JButton loginButton;
    JTextField userText;
    JPasswordField passwordText;

    public Lab15() {
        prepareGUI();
    }
    public static void main(String[] args){
        Lab15  Lab15 = new Lab15();
        Lab15.showEventDemo();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("Java Swing Examples");
        mainFrame.setSize(400,600);
        mainFrame.setLayout(new GridLayout(4,1));

        headerLabel = new JLabel("", JLabel.CENTER);
        statusLabel = new JLabel("", JLabel.CENTER);
        statusLabel.setSize(350, 100);

        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());

        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);

        loginPanel = new JPanel();

        mainFrame.add(loginPanel);
        placeComponents(loginPanel);

        mainFrame.setVisible(true);
    }

    private void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel userLabel = new JLabel("User");
        userLabel.setBounds(10,20,80,25);
        panel.add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField(20);
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);

        loginButton = new JButton("Login");
        loginButton.setBounds(10,80,80,25);
        panel.add(loginButton);
    }

    private void showEventDemo() {
        headerLabel.setText("Control in Action: Button");

        JButton okButton = new JButton("OK");
        JButton submitButton = new JButton("Submit");
        JButton cancelButton = new JButton("Cancel");
        JButton reverseButton = new JButton("Reverse");

        okButton.setActionCommand("OK");
        submitButton.setActionCommand("Submit");
        cancelButton.setActionCommand("Cancel");
        reverseButton.setActionCommand("Reverse");
        loginButton.setActionCommand("Login");

        okButton.addActionListener(new ButtonClickListener());
        submitButton.addActionListener(new ButtonClickListener());
        cancelButton.addActionListener(new ButtonClickListener());
        reverseButton.addActionListener(new ButtonClickListener());
        loginButton.addActionListener(new ButtonClickListener());

        controlPanel.add(okButton);
        controlPanel.add(submitButton);
        controlPanel.add(cancelButton);
        controlPanel.add(reverseButton);

        mainFrame.setVisible(true);
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            statusLabel.setText(command + " Button clicked. ");
            if (command.equals( "Login")) {
                String txt = ("Password: " + new String(passwordText.getPassword()) + ", User: " + userText.getText());
   //             txt += ", User: " + userText.getText();
                statusLabel.setText(txt);
            }
        }
    }
}