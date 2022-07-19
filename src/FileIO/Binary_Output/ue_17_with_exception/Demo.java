package FileIO.Binary_Output.ue_17_with_exception;

public class Demo {
    public static void main(String[] args) {
        Product_Manager productManager = new Product_Manager();
        String path = "test-product.dat";
        Product p1 = new Product("Product 1", 1.00, "Test");
        Product p2 = new Product("Product 22", 2.00, "Test 2");
        productManager.add(p1);
        productManager.add(p2);

        productManager.saveToFile(path);
        productManager.readFromFile(path);

    }

}
