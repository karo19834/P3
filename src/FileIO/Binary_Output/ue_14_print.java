package FileIO.Binary_Output;

import java.io.IOException;
import java.io.PrintStream;

public class ue_14_print {
    public static void main(String[] args) throws IOException {
        String data = "das ist ein Test";
        PrintStream output = new PrintStream("test.dat");
        output.print(data);
        output.flush();
        output.close();
    }
}
