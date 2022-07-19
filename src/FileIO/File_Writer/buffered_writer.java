package FileIO.File_Writer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class buffered_writer {
    public static void main(String args[]) throws IOException {
        //erstellt neues file
        FileWriter fileWriter = new FileWriter("neues_file.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        // BufferedWriter bufferedReader = new BufferedWriter(new FileWriter("neue_datei_18mai.txt"));

        String data = "Das ist ein test";
        bufferedWriter.write(data);
        bufferedWriter.write(data);
        bufferedWriter.newLine();
        bufferedWriter.write(data);
        bufferedWriter.flush();
        bufferedWriter.close();
        System.out.println("Fertig");

    }
}
