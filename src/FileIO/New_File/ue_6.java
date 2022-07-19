package FileIO.New_File;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

public class ue_6 {
    public static void main(String[] args) throws IOException {
        File dir = new File("C:\\Users\\s51642\\Desktop\\Files");
        createFiles(dir);
        renameFiles(dir);
        deleteFile(dir);

    }

    public static void createFiles(File fileList) throws IOException {
        for (int i = 1; i <= 10; i++) {
            File myObj = new File(fileList.getAbsolutePath()+"//"
                    + ThreadLocalRandom.current().nextInt()+ ".mp3");
            if (myObj.createNewFile()){
                System.out.println("Create: "+ fileList.getAbsolutePath());
            }
            else {
                System.out.println( " File already exists ");
            }
        }
    }

    public static void renameFiles (File dir) {
        if (dir.isDirectory()) {
            for (File oldFile : dir.listFiles()) {
                File newFile = new File(oldFile.getParent() + "\\1_" + oldFile.getName());
                if (oldFile.renameTo(newFile)) {
                    System.out.println("RENAME: " + oldFile.getAbsolutePath() + " to " + newFile.getAbsolutePath());
                } else {
                    System.out.println("Sorry! the file can't be renamed");
                }
            }
        }
    }



    public static void deleteFile (File dir){
        if (dir.isDirectory()) {
            for (File file : dir.listFiles()) {
                file.delete();
                System.out.println("DELETED: " + file.getAbsolutePath());
            }
        }
    }
}
