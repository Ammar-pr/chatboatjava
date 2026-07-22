/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javachatapp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

/**
 *
 * @author ASUS
 */
public class ClinetSideHandler implements ActionListener {
  private ChatClient client;
    protected JTextField textField;

    public ClinetSideHandler (JTextField textField) {
    
    
    }
    
    @Override
    
    public void actionPerformed(ActionEvent e) {
 
        //client.sendMessage(textField.getText());
        //textField.setText("");
    }
}


    

