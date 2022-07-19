package FileIO.File_Writer;

import java.io.*;

public class ue_10_wichtig____ {
    //für klausur wichtig!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    public static void main(String[] args) throws IOException {

        File f = new File("noten.txt");
        FileWriter fileWriter = new FileWriter(f);
        PrintWriter printWriter = new PrintWriter(fileWriter);

        System.out.println("Bitte geben Sie ihr Fach sowie Note ein:");
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String line;
        while (!(line = bufferedReader.readLine()).equals("STOP")) {
            printWriter.println(line);
            System.out.println(line);
        }
        bufferedReader.close();

        printWriter.flush();
        printWriter.close();
        System.out.println("Datei erzeugt.");
    }
}
