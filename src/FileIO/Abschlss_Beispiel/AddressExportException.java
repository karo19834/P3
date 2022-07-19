package FileIO.Abschlss_Beispiel;

import java.io.IOException;

public class AddressExportException extends Throwable {
    public AddressExportException(IOException e) {
    e.printStackTrace();
}

}
