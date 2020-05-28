package thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {
    private ServerSocket serverSocket;
    private Socket socket;

    private BufferedReader in;
    private PrintWriter out;

    public SocketServer() {
        try {
            serverSocket = new ServerSocket(9999);
            System.out.println("Server Running..");

            socket = serverSocket.accept();
            System.out.println("Success..! Connect Client");

            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream());

            // Receive Client send message
            System.out.println(in.readLine());

            // Send to Client
            out.println("Hello Client");
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        SocketServer socketServer = new SocketServer();
    }
}
