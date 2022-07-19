package FileIO.File_Writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class print_writer {
    public static void main(String[] args) throws IOException {

        FileWriter fileWriter = new FileWriter("new.txt", true);//- schreibt content dazu
        PrintWriter printWriter = new PrintWriter(fileWriter);

        String karo = "Tralalal";

        printWriter.println("Zeile1444");
        printWriter.println("Zeile2");
        printWriter.println("Zeile3");
        printWriter.println("Zeile4");
        printWriter.println("Zeile5");
        printWriter.println("Zeile6");
        printWriter.println("Zeile7");
        printWriter.format("Zeile8 %s", karo);
        printWriter.println();

        printWriter.flush();
        printWriter.close();
        System.out.println("Fertig gemacht!! ");

    }
}
