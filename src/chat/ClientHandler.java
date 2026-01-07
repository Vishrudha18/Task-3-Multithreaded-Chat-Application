package chat;

import java.io.*;
import java.net.*;
import java.util.*;

public class ClientHandler implements Runnable {

    private Socket socket;
    private BufferedReader in;
    private PrintWriter out;
    private Set<ClientHandler> clients;

    public ClientHandler(Socket socket, Set<ClientHandler> clients) {
        this.socket = socket;
        this.clients = clients;

        try {
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void run() {

        try {
            String message;

            while ((message = in.readLine()) != null) {
                System.out.println("Received: " + message);
                broadcast(message);
            }

        } catch (IOException e) {
            System.out.println("Client disconnected");
        } finally {
            try {
                socket.close();
            } catch (IOException e) {}
            clients.remove(this);
        }
    }

    private void broadcast(String message) {
        for (ClientHandler client : clients) {
            client.out.println(message);
        }
    }
}
