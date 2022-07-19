package FileIO.File_Reader;

import java.io.StringReader;

public class ue_7_string_reader {
    public static void main(String[] args) throws Exception {
        String srg = "Hello Java";
        StringReader stringReader = new StringReader(srg);
        int c = 0;
        while ((c = stringReader.read()) != -1) {
            System.out.print((char) c);
        }
    }
}
