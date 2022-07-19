package FileIO.File_Writer.ue_11;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Product_Manager {
    List<Product> productList = new ArrayList<>();

    public void add(Product p) {
        productList.add(p);
    }

    public void saveToFile(String path)  {
        File file = new File(path);
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (Product p : productList) {
            bufferedWriter.write(p.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Produkt gespeichert ");
    }

    public void readFromFile(String path) throws IOException {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        fileReader = new FileReader(path);
        bufferedReader = new BufferedReader(fileReader);

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        bufferedReader.close();
        System.out.println("Produkt gelesen.");
    }
}
