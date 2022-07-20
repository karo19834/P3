package pr3.beispiel2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class TimeClient {

    public static void main(String[] args) {

        BufferedReader bufferedReader = null;
        try {
            System.out.println("Connecting to Server");
            Socket socket = new Socket("localhost", 1111);
            bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            System.out.println("Reading from Server");
            System.out.println("TIME Information -> " + bufferedReader.readLine());
            System.out.println("Exiting the Client!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
