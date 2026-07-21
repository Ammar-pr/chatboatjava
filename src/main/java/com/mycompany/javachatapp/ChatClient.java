/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javachatapp;
import java.io.*;
import java.net.*;

/**
 *
 * @author ammar
 */
public class ChatClient {
   
    public static void main(String [] array)throws IOException{
        Socket socket = new Socket("localhost",5000);
        System.out.println("Connected to server");
    }
    
}
