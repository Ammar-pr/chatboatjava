/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javachatapp;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author ammar
 */
public class Javachatapp {

    public static void main(String[] args) throws IOException {
      ServerSocket serverSocket = new ServerSocket(2000); // Port number 2000
      System.out.println("Server started. Waiting for clients...");
      Socket clientSocket = serverSocket.accept();
      System.out.println("Client connected.");
    }
}
