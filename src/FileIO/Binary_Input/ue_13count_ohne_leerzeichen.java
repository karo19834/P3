package FileIO.Binary_Input;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ue_13count_ohne_leerzeichen {
    public static void main(String[] args) throws IOException {

        File file = new File("new.txt");
        // FileInputStream stellt eine Verbindung zur Datei her. Datei wird geöffnet.
        FileInputStream fileInputStream = new FileInputStream(file);
        // Für Optimierung der Performance -> BufferedInputStream
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

        // read() liefert Byte for Byte aus der Datei. Wenn das Ende erreicht ist, dann liefert die Methode -1 als Ergebnis.
        // While-Schleife liest somit Zeichen um Zeichen aus.
        int byteRead;
        int character_count = 0;
        while ((byteRead = bufferedInputStream.read()) != -1) {
            // char[] ch = Character.toChars(byteRead);
            // System.out.println(ch);
            // Byte wird in char umgewandelt und ausgegeben.

            if (!Character.isWhitespace((char) byteRead)) {
                System.out.println((char) byteRead);
                character_count++;
            }
        }

        System.out.println(character_count);

        // close() gibt die Datei wieder frei.
        bufferedInputStream.close();
    }
}
