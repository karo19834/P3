package Network.read_from_url;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class readFromURL {
    public static void main(String[] args) {
        // -> 80 -> Redirect -> 443 -> Antwort
        // -> https://www.google.at ; https://www.wetter.at
        try {
            // USER INPUT
            System.out.println("Bitte gewünschte URL angeben: ");
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            String user_url = userInput.readLine();
            System.out.println("URL : " + user_url);

            // URL AUSLESEN
            URL url = new URL(user_url);
            // openStream() -> Opens a connection to this URL and returns an InputStream for reading from that connection.
            InputStreamReader inputStreamReader = new InputStreamReader(url.openStream());
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("content.html"));
            // Process INPUT
            String input;
            while ((input = bufferedReader.readLine()) != null) {
                System.out.println(input);
                bufferedWriter.write(input);
            }
            bufferedReader.close();
            bufferedWriter.close();

            System.out.println("wir sind fertig");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
