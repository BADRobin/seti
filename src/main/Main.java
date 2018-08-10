package main;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

    public static void main(String[] args) {
	new Main().run();
    }

    private void run() {
        try (ServerSocket serverSocket = new ServerSocket(1234)){
            for (;;){
                Socket socket = serverSocket.accept();
                PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
                out.println("Helo, World");
                socket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
