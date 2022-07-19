package FileIO.Binary_Output;

import java.io.*;

public class ue_16 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String s = "Hello World";
        byte[] b = {'e', 'x', 'a', 'm', 'p', 'l', 'e'};


        File file = new File("object.dat");
        // Teil 1 - Schreibe Objekt(e) in Datei
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        // write something in the file
        objectOutputStream.writeObject(s);
        objectOutputStream.writeObject(b);
        objectOutputStream.flush();
        objectOutputStream.close();

        // create an ObjectInputStream for the file we created before
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        // System.out.println(objectInputStream.readObject()); -> Cast is missing!
        // read and print an object and cast it as string
        System.out.println("STRING: " + (String) objectInputStream.readObject());

        // read and print an object and cast it as string
        byte[] text2 = (byte[]) objectInputStream.readObject();
        String s2 = new String(text2);
        System.out.println("BYTE[]: " + s2);


    }
}
