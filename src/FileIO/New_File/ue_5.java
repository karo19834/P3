package FileIO.New_File;

import java.io.File;

public class ue_5 {
    public static void main(String[] args) {

        File directories = new File("C:\\Users\\s51642\\Desktop\\test456\\test890\\");
        createDirectories(directories);
    }

    public static void createDirectories(File f){
        if (f.exists()) {
            System.out.println("Directories already exists");
        } else {
            f.mkdirs();
            System.out.println("Multiple Directories created!");
        }
    }
}
