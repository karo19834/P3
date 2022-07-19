package FileIO.New_File;

import java.io.File;

public class ue_2_liest_all_drectories {
    public static void main(String[] args) {

        File dir = new File("C:/");
        File[] files;
        files= dir.listFiles();

        for (File file : files) {
            if (file.isDirectory()) {
                System.out.println("Dir: "+file);
            }else {
                System.out.println("File: "+file);
            }
        }
    }
}
