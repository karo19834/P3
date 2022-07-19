package FileIO.File_Reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ue_8 {
    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        String line;
        while ((line =br.readLine()) != null) {
            System.out.println(line);
            if (line.equals("STOP")) {
                break;
            }
        }
        br.close();
        System.out.println("Finish!");
    }
}
