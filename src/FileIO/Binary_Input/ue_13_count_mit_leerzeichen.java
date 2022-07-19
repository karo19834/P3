package FileIO.Binary_Input;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ue_13_count_mit_leerzeichen {
    public static void main(String[] args) throws IOException {
        // Repräsentiert eine Datei auf dem Dateisystem
        File file = new File("new.txt");

        // FileInputStream stellt eine Verbindung zur Datei her. Datei wird geöffnet.
        FileInputStream fileInputStream = new FileInputStream(file);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

        // read() liefert Byte for Byte aus der Datei. Wenn das Ende erreicht ist, dann liefert die Methode -1 als Ergebnis.
        // While-Schleife liest somit Zeichen um Zeichen aus.
        int byteRead;
        // character -> Damit man die Anzahl der Zeichen zählen kann
        int character = 0;

        while ((byteRead = bufferedInputStream.read()) != -1) {
            System.out.println((char) byteRead);
            character++;
        }

        // Ausgabe Anzahl der Zeichen, nachdem  die Datei vollständig durchgesehen wurde.
        System.out.println(character);
        // close() gibt die Datei wieder frei.
        fileInputStream.close();
        bufferedInputStream.close();
    }
}
