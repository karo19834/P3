package FileIO.File_Writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class print_writer_2 {
    public static void main(String[] args) throws IOException {

        PrintWriter printWriter = new PrintWriter(new FileWriter("output.txt"));

        int age = 25;

        printWriter.printf("I am %d years old.", age);
        printWriter.println("I am " + age + " years old.");

        printWriter.flush();

        System.out.println(printWriter.checkError());

        printWriter.close();


    }
}
