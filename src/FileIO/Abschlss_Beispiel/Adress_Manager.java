package FileIO.Abschlss_Beispiel;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Adress_Manager {
    private ArrayList<Adress> addresses;

    public Adress_Manager() {
        addresses = new ArrayList<>();
    }

    public ArrayList<Adress> getAddresses() {
        return addresses;
    }

    public void add(Adress a) {
        addresses.add(a);
    }

    public void exportToCsv(String path, String separator) throws AddressExportException, AddressExportFileAlreadyExistsException {
        BufferedWriter bufferedWriter = null;
        // PrintWriter printWriter = null;
        /*
        File f = new File(path);
        if (f.exists()) {
            throw new AddressExportFileAlreadyExistsException("File existiert bereits");
        } */

        try {
            FileWriter fileWriter = new FileWriter(path);
            bufferedWriter = new BufferedWriter(fileWriter);
            // printWriter = new PrintWriter(fileWriter);

            for (Adress address : getAddresses()) {
                bufferedWriter.write(address.getFirstname() + separator + address.getLastname()
                        + separator + address.getMobilNumber() + separator + address.getEmail());
                bufferedWriter.newLine();
                // printWriter.println(address.getFirstname() + separator + address.getLastname()
                //       + separator + address.getMobilNumber() + separator + address.getEmail());
                System.out.println("Object has been written to file: " + address);
            }

            bufferedWriter.flush();
            // printWriter.flush();

        } catch (IOException e) {
            throw new AddressExportException(e);
        } finally {
            try {
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
                /*
                if (printWriter != null) {
                    pw.close();
                } */
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public List<Adress> loadFromCsv(String path, String separator) throws AddressLoadWrongFormatException, AddressLoadException {
        List<Adress> addressList = new ArrayList<>();
        BufferedReader bufferedReader = null;

        try {
            FileReader fr = new FileReader(path);
            bufferedReader = new BufferedReader(fr);

            String temp;
            while (((temp = bufferedReader.readLine()) != null)) {
                String[] tempp = temp.split(separator);
                if (tempp.length != 4) {
                    throw new AddressLoadWrongFormatException("4 Spalten erwartet!");
                }
                addressList.add(new Adress(tempp[0], tempp[1], tempp[2], tempp[3]));
            }
        } catch (IOException e) {
            throw new AddressLoadException(e);
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                throw new AddressLoadException(e);
            }
        }
        return addressList;
    }


}
