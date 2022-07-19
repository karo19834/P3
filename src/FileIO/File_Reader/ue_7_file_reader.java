package FileIO.File_Reader;

import java.io.FileReader;
import java.io.IOException;

public class ue_7_file_reader {
    public static void main(String[] args) throws IOException {
        // File Reader Constructors: File; String (Filepath); File + Charset; String + Charset)
        FileReader fileReader = new FileReader("test.html");

        // Zeichen für Zeichen wird eingelesen.
        // Ist das Dateiende erreicht, so wird -1 zurückgeliefert.
        int c;
        while ((c = fileReader.read()) != -1) {
            // int muss auf char gecastet werden, um somit Buchstaben zu erhalten. (Sonst nur Zahlen)
            char character = (char) c;
            System.out.println("int: " + c + " -> char: " + character);
        }
        // Filereader wird geschlossen
        fileReader.close();
    }
}
