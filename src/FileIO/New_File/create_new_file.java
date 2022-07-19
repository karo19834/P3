package FileIO.New_File;

import java.io.File;
import java.io.IOException;

public class create_new_file {
    public static void main(String[] args) throws IOException {

        String fileSeparator = System.getProperty("file.separator");
        System.out.println("File separator: "+ fileSeparator);


        File file = new File("C:\\Users\\s51642\\Desktop\\testdatei.txt");
        File file2 = new File("C: "+fileSeparator+ "Users"+fileSeparator+"51642"+fileSeparator+"Desktop"+fileSeparator+"testdatei.txt");
        File html = new File("test.html");


        if ( file.createNewFile()) {
            System.out.println("new file");
            System.out.println(file.getName());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.getAbsoluteFile());
        }else{
            System.out.println("already exist");
        }

    }
}
