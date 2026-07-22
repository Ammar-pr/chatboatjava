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

    private Socket socket = null;
    private BufferedReader inputConsole = null;
    private PrintWriter out = null;
    private BufferedReader in = null;
    protected String key;

    public ChatClient(String address, int port) throws IOException {
        try {
            socket = new Socket(address, port);
            System.out.println("Connetecd to the chat server");
            inputConsole = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(socket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String line = "";
            while (!line.equals("exit")) {
                line = inputConsole.readLine();
                out.println(line);
                System.out.println(in.readLine());

            }
            socket.close();
            inputConsole.close();
            out.close();

        } catch (UnknownHostException u) {
            {
                System.out.println("host error exception" + u.getMessage());
            }
        } catch (IOException i) {
            System.out.println("Unexpected exception: " + i.getMessage());
        }
    }

    public static void main(String args[]) throws IOException {
        ChatClient client = new ChatClient("127.0.0.1", 5000);
    }

}
