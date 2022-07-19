package FileIO.New_File;

import java.io.File;
import java.io.IOException;

public class ue_1 {
    public static void main(String[] args) throws IOException {

        File file = new File("uebung.html");
        fileInfo(file);
    }
    public static void fileInfo(File file){
        System.out.println("does this file exist: "+ file.exists());
        System.out.println("the name of file is: "+ file.getName());
        System.out.println("parent directory of this file is: "+ file.getParent());
        System.out.println("path to this file is: "+ file.getPath());
        System.out.println("the full path to this file is: "+ file.getAbsolutePath());
        System.out.println("is this a directory?: "+ file.isDirectory());
        System.out.println("is this a file?: "+ file.isFile());
        System.out.println("is this a hidden file?: "+ file.isHidden());
        System.out.println("is this file readable?: "+ file.canRead());
        System.out.println("is this file writable?: "+ file.canWrite());
        System.out.println("File size: "+ file.length());
    }
}
