package FileIO.Binary_Output;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ue_15 {
    public static void main(String[] args) throws IOException {
        File file = new File("test-output.dat");
        FileOutputStream fileOutputStream = new FileOutputStream(file);

        char c;
        while ((c = (char) System.in.read()) != 'x') {
            fileOutputStream.write(c);
            System.out.println(c);
        }
        fileOutputStream.flush();
        fileOutputStream.close();
        System.out.println("Closed");
    }
}
