package lab12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;

public class ChatServer {
    private List<ClientHandler> clients;
    public ChatServer() {
        this.clients = new ArrayList<ClientHandler>();
    }
    public void start(int portNumber){
        try(ServerSocket serverSocket = new ServerSocket((portNumber))){
            System.out.println("Server is running.");
            while(true){
                Socket socket = serverSocket.accept();
                System.out.println("Client connected.");
                clients.add(new ClientHandler(socket));
            }

        }catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        
    }

    private void broadcastMessage(String message, ClientHandler sender) {
        synchronized (clients) {
            for (ClientHandler client : clients) {
                if (client != sender) {
                    client.sendMessage(message);
                }
            }
        }
    }

    private class ClientHandler implements Runnable{
        private Socket socket;
        private BufferedReader reader;
        private PrintWriter writer;
        private String username;
        public ClientHandler(Socket socket){
            this.socket = socket;
        }
        @Override
        public void run() {
            try {
                reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                writer = new PrintWriter(socket.getOutputStream(), true);

                username = reader.readLine();
                System.out.println(username + " has joined the chat.");
                broadcastMessage(username + " has joined the chat.", this);

                String message;
                while ((message = reader.readLine()) != null) {
                    System.out.println(username + ": " + message);
                    broadcastMessage(username + ": " + message, this);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                clients.remove(this);
                broadcastMessage(username + " has left the chat.", this);
                System.out.println(username + " has left the chat.");
            }
        }
        public void sendMessage(String message) {
            writer.println(message);
        }

    }

}
