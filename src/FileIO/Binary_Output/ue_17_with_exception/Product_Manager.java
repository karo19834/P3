package FileIO.Binary_Output.ue_17_with_exception;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Product_Manager {
    /*
    1. Schreiben Sie eine Klasse Product zur Abbildung von Produkten mit folgenden Attributen.
        String ProductName
        Double Price
        String ProductCategory
        Tipp:
            implements Serializable verwenden
            getter, setter, tostring, constructor erstellen


    2. Schreiben Sie eine Klasse ProductManager zum Verwalten von Produkten in einer privaten
    Liste und implementieren Sie folgende Methoden
        public void add(Product p) ➔ fügt ein Produkt zur Liste hinzu
        public void saveToFile(String path) ➔ speichert die Produkte in der übergebenen Datei. -
            Realisieren Sie dies mittels ObjectOutputStream und FileOutputStream.
        public List<Product> readFromFile(String path)
            ➔ laden Sie das Object Product von der übergebenen Datei und
                geben Sie die Objecte mittels toString() auf der Konsole aus.
            Tipp:
                    -   arbeiten Sie beim auslesen der Dateien mit einer While Schleife
                    -   verwenden Sie readObject()
                    -   verwenden Sie einen try catch block, um die Exception: EOFException zu behandeln

 */

    List<Product> productList = new ArrayList<>();

    public void add(Product p) {
        productList.add(p);
    }

    public void saveToFile(String path) {
        File file = new File(path);
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            // BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);

            System.out.println("WRITE to file: ");
            for (Product p : productList) {
                objectOutputStream.writeObject(p);
                System.out.println(p);
            }
            objectOutputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (objectOutputStream != null) {
                    objectOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Saving Done");
    }

    public void readFromFile(String path) {
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        List<Product> productList = new ArrayList<>();
        try {
            fileInputStream = new FileInputStream(path);
            objectInputStream = new ObjectInputStream(fileInputStream);

            Object object;
            while ((object = objectInputStream.readObject()) != null) {
                Product p = (Product) object;
                productList.add(p);
                System.out.println(p);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (EOFException e) {
            System.out.printf("End of File");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("FINAL READ Object data: ");
        System.out.println(productList);

    }

}
