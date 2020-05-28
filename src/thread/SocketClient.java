package thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SocketClient {

    private Socket socket;
    private BufferedReader in;
    private PrintWriter out;

    public SocketClient(String ip, int port) {
        try {
            socket = new Socket(ip, port);
            System.out.println(ip + " Access");

            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream());

            // send
            out.println("Hello..!");
            out.flush();

            // print
            System.out.println(in.readLine());

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // close
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        String ip = "172.18.27.113";
        int port = 9999;

        new SocketClient(ip,port);

    }
}
