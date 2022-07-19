package FileIO.Abschlss_Beispiel;

public class Demo {

    public static void main(String[] args) {

    String filePath = "test.csv";
    String separator = ","; // in case von PIPE -> \\| (needs to be escaped!)
    Adress_Manager addressManager = new Adress_Manager();
    Adress a1 = new Adress("Robert", "Leitner", "0660", "Robert.leitner@outlook.com");
    Adress a2 = new Adress("Sabine", "Leitner", "0660", "Sabine.leitner@outlook.com");
    Adress a3 = new Adress("Christopher", "Leitner", "0660", "Christopher.leitner@outlook.com");
    Adress a4 = new Adress("Horst", "Leitner", "0660", "Horst.leitner@outlook.com");

    addressManager.add(a1);
    addressManager.add(a2);
    addressManager.add(a3);
    addressManager.add(a4);

    try {
        System.out.println("Result from exportToCsv() Method:");
        addressManager.exportToCsv(filePath, separator);
    } catch (AddressExportFileAlreadyExistsException e) {
        e.printStackTrace();
    } catch (AddressExportException e) {
        e.printStackTrace();
    }

    try {
        System.out.println("Result from loadFromCSV() Method:");
        System.out.println(addressManager.loadFromCsv(filePath, separator));
    } catch (AddressLoadWrongFormatException e) {
        e.printStackTrace();
    } catch (AddressLoadException e) {
        e.printStackTrace();
    }
}

}
