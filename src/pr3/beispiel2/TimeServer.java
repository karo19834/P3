package pr3.beispiel2;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;

public class TimeServer {
    public static void main(String[] args) {
        int counter = 0;
        BufferedWriter bufferedWriter = null;

        try {
            System.out.println("Start server on localhost:1111");
            ServerSocket serverSocket = new ServerSocket(1111);

            while (counter < 5) {
                System.out.println("Waiting for new clients...");
                Socket socket = serverSocket.accept();
                counter++;
                System.out.println(socket.getPort() + " accessed to server!");
                System.out.println(counter + ". Zugriff seit dem der Server gestartet ist!");

                LocalDateTime localDateTime = LocalDateTime.now();
                System.out.println("Sending TIME Information to client: " + localDateTime);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                bufferedWriter.write(LocalDateTime.now().toString());
                bufferedWriter.newLine();
                bufferedWriter.flush();
                System.out.println(socket.getPort() + " exiting the server!");
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Server hat sich nach " + counter + " Zugriffen abgeschalten!");
    }

}
