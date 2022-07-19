package FileIO.Abschlss_Beispiel;

import java.io.IOException;

public class AddressLoadException extends Throwable{
    public AddressLoadException(IOException e) {
        e.printStackTrace();
    }

}
