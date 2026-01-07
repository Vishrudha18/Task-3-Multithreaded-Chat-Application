package chat;

import java.net.*;
import java.io.*;
import java.util.*;

public class ChatClient {

    public static void main(String[] args) {

        String serverAddress = "localhost";
        int port = 6000;

        try {
            Socket socket = new Socket(serverAddress, port);
            System.out.println("Connected to chat server");

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            PrintWriter out = new PrintWriter(
                    socket.getOutputStream(), true);

            Scanner scanner = new Scanner(System.in);

            // Thread to receive messages
            new Thread(() -> {
                try {
                    String msg;
                    while ((msg = in.readLine()) != null) {
                        System.out.println(msg);
                    }
                } catch (IOException e) {
                    System.out.println("Connection closed");
                }
            }).start();

            // Main thread to send messages
            while (true) {
                String message = scanner.nextLine();
                out.println(message);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
