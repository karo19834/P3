package FileIO.New_File;

import java.io.File;
import java.util.Scanner;

public class create_new_directory_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter directory name which should be created");
        String path = scanner.next();
        System.out.println("new directory: "+ path);


        File file = new File(path);
        boolean created = file.mkdirs();


        if (created){
            System.out.println("Dierctory has been created");
        }else{
            System.out.println("Dierctory has NOT been created");
        }
    }
}
