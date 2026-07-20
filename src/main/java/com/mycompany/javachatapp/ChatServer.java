/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javachatapp;

/**
 *
 * @author AMMAR
 */
import java.io.*;
import java.net.*;

public class ChatServer {
  public static void main(String[] args) throws IOException {
      ServerSocket serverSocket = new ServerSocket(2000); // Port number 2000
      System.out.println("Server started. Waiting for clients...");
      Socket clientSocket = serverSocket.accept();
      System.out.println("Client connected.");
      // Additional code to handle communication will be added later
  }
}
