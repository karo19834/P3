package FileIO.File_Writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ue_9 {
    public static void main(String[] args) throws IOException {

        FileWriter fileWriter = new FileWriter("neue_datei.txt");
        PrintWriter printWriter = new PrintWriter(fileWriter);

        // Mittels println(...) werden Zwei Zeilen geschrieben. Jede Zeile wird richtig abgeschlosen.
        String java="ff";
        printWriter.println("FirstLine");
        printWriter.println("SecondLine");
        printWriter.print(1);
        printWriter.print(2);
        printWriter.println();
        printWriter.format("This is a %s program with %d", "Hello World", 100);
        printWriter.format("This is a %s program with %d", java, 100);
        // printWriter.printf()

        // flush() löst das Schreiben aus
        // Flushing a stream ensures that all data that has been written
        // to that stream is output, including clearing any that may have been buffered.
        printWriter.flush();
        // close() gibt die Datei wieder frei
        printWriter.close();
        System.out.println("Fertig");


    }
}
