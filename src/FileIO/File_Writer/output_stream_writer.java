package FileIO.File_Writer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class output_stream_writer {
    public static void main(String[] args) throws IOException {

        String data = " ä ö example";

        FileOutputStream file = new FileOutputStream("nowylalala.txt");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(file, StandardCharsets.UTF_8);

        outputStreamWriter.write(data);
        outputStreamWriter.flush();
        outputStreamWriter.close();
    }
}
