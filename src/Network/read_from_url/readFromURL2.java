package Network.read_from_url;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class readFromURL2 {

    /*
   URLConnection is the base class.

   HttpURLConnection is a derived class which you can use when you need the extra API and you are dealing with HTTP or HTTPS only.

   HttpsURLConnection is a 'more derived' class which you can use when you need the 'more extra' API and you are dealing with HTTPS only.
    */
    public static void main(String[] args) {
        try {
            URL urlObj = new URL("https://www.google.com");
            URLConnection urlCon = urlObj.openConnection();

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlCon.getInputStream()));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("content.html"));

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }

            bufferedReader.close();
            bufferedWriter.flush();
            bufferedWriter.close();

            System.out.println("Web page saved");

        } catch (MalformedURLException e) {
            System.out.println("The specified URL is malformed: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("An I/O error occurs: " + e.getMessage());
        }
    }

}
