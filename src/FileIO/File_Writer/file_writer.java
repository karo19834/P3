package FileIO.File_Writer;

import java.io.FileWriter;
import java.io.IOException;

public class file_writer {
    public static void main(String[] args) throws IOException {

        String data = "This is the data in the output file";

        // Creates a FileWriter
        FileWriter fileWriter = new FileWriter("neue_datei_18mai.txt");
        fileWriter.write(data);
        // Writes the string to the file
        fileWriter.flush();
        // Closes the writer
        fileWriter.close();
        System.out.println("File created.");
    }
}
