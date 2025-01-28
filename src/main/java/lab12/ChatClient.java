package lab12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatClient {
    public static void main(String[] args) {
        if(args.length < 2){
            System.out.println("Usage: java ChatClient <username> <server_ip>");
            return;
        }
        String username = args[0];
        String server_ip = args[1];
        int port = 12345;
        try{
            Socket socket = new Socket(server_ip, port);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            out.println(username);
            new Thread(()->{
                try{
                    String serverMessage;
                    while((serverMessage = in.readLine()) != null){
                        System.out.println("Server message: " + serverMessage);
                    }
                }catch(IOException e){
                    e.printStackTrace();
                }
            }).start();

            String clientMessage;
            while((clientMessage = consoleReader.readLine()) != null){
                out.println(clientMessage);
            }
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
