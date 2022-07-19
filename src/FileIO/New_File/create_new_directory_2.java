package FileIO.New_File;

import java.io.File;
import java.util.Scanner;

public class create_new_directory_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter directory path where new folder should be created ");
        String path = scanner.next();
        System.out.println("enter the name of the NEW directory");
        path = path + scanner.next();
        System.out.println( " New directory: " + path );


        File file = new File(path);
        boolean created = file.mkdirs();


        if (created){
            System.out.println("Dierctory has been created");
        }else{
            System.out.println("Dierctory has NOT been created");
        }
    }
}
