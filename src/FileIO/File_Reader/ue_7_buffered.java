package FileIO.File_Reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ue_7_buffered {
    public static void main(String[] args) throws IOException, IOException {


        // öffnet die Datei test.html
        File file = new File("test.html");
        // liefert einen textorientierten Stream der Datei zurück
        FileReader fileReader = new FileReader(file);
        // legt einen BufferedReader über den FileReader.
        // Somit kann komfortabler/effizenter auf die Datei zugegriffen werden.
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        // ODER
        BufferedReader br = new BufferedReader(new FileReader(new File("test.html")));
        BufferedReader br2 = new BufferedReader(new FileReader("test.html"));


        String line;
        while ((line = br2.readLine()) != null) {
            System.out.println(line);
        }
        // bufferedReader wird geschlossen
        bufferedReader.close();
    }
}
