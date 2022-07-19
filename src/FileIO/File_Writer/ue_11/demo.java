package FileIO.File_Writer.ue_11;

import java.io.IOException;

public class demo {
    public static void main(String[] args) throws IOException {

        Product_Manager productManager = new Product_Manager();
        String path = "text.txt";
        Product p1 = new Product("Product 1", 1.00, "Test");
        Product p2 = new Product("Product 2", 2.00, "Test 2");
        Product p3 = new Product("Product 3", 3.00, "Test 3");
        productManager.add(p1);
        productManager.add(p2);
        productManager.add(p3);
        productManager.saveToFile(path);
        productManager.readFromFile(path);
    }
}
