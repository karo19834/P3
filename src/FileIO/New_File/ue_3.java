package FileIO.New_File;

import java.io.File;

public class ue_3 {
    public static void main(String[] args) {

        File dir = new File("C:\\Users\\s51642\\Desktop\\myProjekt\\");
        listFiles(dir.getAbsolutePath());

    }
    public static void listFiles( String path) {
        File root = new File(path);
        File[] list = root.listFiles();

        if (list == null) return;

        for (File f : list) {
            if (f.isDirectory()) {
                System.out.println("Dir: " + f.getAbsoluteFile());
                //System.out.println("Files in dir: ");
                listFiles(f.getAbsolutePath());
            } else {
                System.out.println("File: " + f.getAbsoluteFile());
            }
        }
    }
}
