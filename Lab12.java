//package com.tutorialspoint.gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Lab12 {
    public static class SwingControlDemo {
        private JFrame mainFrame;
        private JLabel headerLabel;
        private JLabel statusLabel;
        private JPanel controlPanel;

        public SwingControlDemo(){
            prepareGUI();
        }
 /*
     public Lab14(){
        prepareGUI();
    }
  */
        public static void main(String[] args){
            SwingControlDemo  swingControlDemo = new SwingControlDemo();
            swingControlDemo.showButtonDemo();
            Lab12 Lab12 = new Lab12();
        }
        private void prepareGUI(){
            mainFrame = new JFrame("Java Swing Examples");
            mainFrame.setSize(400,400);
            mainFrame.setLayout(new GridLayout(3, 1));

            mainFrame.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent windowEvent){
                    System.exit(0);
                }
            });
            headerLabel = new JLabel("", JLabel.CENTER);
            statusLabel = new JLabel("",JLabel.CENTER);
            statusLabel.setSize(350,100);

            controlPanel = new JPanel();
            controlPanel.setLayout(new FlowLayout());

            mainFrame.add(headerLabel);
            mainFrame.add(controlPanel);
            mainFrame.add(statusLabel);
            mainFrame.setVisible(true);
        }
        private static ImageIcon createImageIcon(String path, String description) {
            java.net.URL imgURL = SwingControlDemo.class.getResource(path);
            if (imgURL != null) {
                return new ImageIcon(imgURL, description);
            } else {
                System.err.println("Couldn't find file: " + path);
                return null;
            }
        }
        private void showButtonDemo() {
            headerLabel.setText("Control in action: Button");

            //resources folder should be inside SWING folder.
            ImageIcon icon = createImageIcon("/resources/java_icon.png","Java");

            JButton okButton = new JButton("OK");
            JButton javaButton = new JButton("Submit", icon);
            JButton cancelButton = new JButton("Cancel", icon);
            JButton reverseButton = new JButton("Reverse");
            cancelButton.setHorizontalTextPosition(SwingConstants.LEFT);
            //create a menu bar
            final JMenuBar menuBar = new JMenuBar();

            //create menus
            JMenu fileMenu = new JMenu("File");
            JMenu editMenu = new JMenu("Edit");
            final JMenu aboutMenu = new JMenu("About");
            final JMenu linkMenu = new JMenu("Links");
            //create menu items
            JMenuItem newMenuItem = new JMenuItem("New");
            newMenuItem.setMnemonic(KeyEvent.VK_N);
            newMenuItem.setActionCommand("New");

            JMenuItem openMenuItem = new JMenuItem("Open");
            openMenuItem.setActionCommand("Open");

            JMenuItem saveMenuItem = new JMenuItem("Save");
            saveMenuItem.setActionCommand("Save");

            JMenuItem exitMenuItem = new JMenuItem("Exit");
            exitMenuItem.setActionCommand("Exit");

            JMenuItem cutMenuItem = new JMenuItem("Cut");
            cutMenuItem.setActionCommand("Cut");

            JMenuItem copyMenuItem = new JMenuItem("Copy");
            copyMenuItem.setActionCommand("Copy");

            JMenuItem pasteMenuItem = new JMenuItem("Paste");
            pasteMenuItem.setActionCommand("Paste");

            MenuItemListener menuItemListener = new MenuItemListener();

            newMenuItem.addActionListener(menuItemListener);
            openMenuItem.addActionListener(menuItemListener);
            saveMenuItem.addActionListener(menuItemListener);
            exitMenuItem.addActionListener(menuItemListener);
            cutMenuItem.addActionListener(menuItemListener);
            copyMenuItem.addActionListener(menuItemListener);
            pasteMenuItem.addActionListener(menuItemListener);

            final JCheckBoxMenuItem showWindowMenu = new JCheckBoxMenuItem("Show About", true);
            showWindowMenu.addItemListener(new ItemListener() {
                public void itemStateChanged(ItemEvent e) {

                    if(showWindowMenu.getState()){
                        menuBar.add(aboutMenu);
                    } else {
                        menuBar.remove(aboutMenu);
                    }
                }
            });

            okButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    statusLabel.setText("Ok Button clicked.");
                }
            });
            javaButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    statusLabel.setText("Submit Button clicked.");
                }
            });
            cancelButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    statusLabel.setText("Cancel Button clicked.");
                }
            });
            reverseButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    statusLabel.setText("Reverse Button clicked.");
                }
            });
            controlPanel.add(okButton);
            controlPanel.add(javaButton);
            controlPanel.add(reverseButton);
            controlPanel.add(cancelButton);

            mainFrame.setVisible(true);
        }
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                mainFrame.dispose();
            }
        }
    }
}

/*
if (command.equals( "Login")) {
    String txt = "Password: " + new String(passwordText.getPassword());
    txt += ", User: " + userText.getText();
    statusLabel.setText(txt);
        }
 */