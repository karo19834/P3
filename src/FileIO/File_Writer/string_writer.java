package FileIO.File_Writer;

import java.io.IOException;
import java.io.StringWriter;

public class string_writer {
    public static void main(String[] args) throws IOException {

        String data = "This is the text in the string.";

        StringWriter stringWriter = new StringWriter();
        stringWriter.write(data);
        stringWriter.append("append");
        stringWriter.flush();
        stringWriter.close();
        System.out.println("Data of StringWriter: "+ stringWriter);
    }
}
