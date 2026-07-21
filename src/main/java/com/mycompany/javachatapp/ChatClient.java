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
   
    private Socket socket=null;
    private BufferedReader inputConsole=null;
    private PrintWriter out = null;
    private BufferedReader in= null;

    public ChatClient(String address, int port) {
    try {
        socket= new Socket(address,port);
        System.out.println("Connetecd to the chat server");
        inputConsole = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(socket.getOutputStream(),true);
        in= new BufferedReader(new InputStreamReader(socket.getInputStream()));
        
    }catch(IOException ex){
        System.out.println(ex.getMessage());
    }
    
    }
    
    public static void main(String [] array)throws IOException{
        Socket socket = new Socket("localhost",5000);
        System.out.println("Connected to server");
    }
    
}
