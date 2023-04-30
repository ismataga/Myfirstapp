package udemyCourse1.proyekt2ay.util;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileUtility {
    public static Object readFileDeserialize(String name) {
        Object obj = null;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(name))) {
            obj = in.readObject();
        } finally {
            return obj;
        }
    }

    public static boolean writeObjectToFile(Object object, String name) throws RuntimeException {
        try (FileOutputStream fout = new FileOutputStream(name);
             ObjectOutputStream oos = new ObjectOutputStream(fout);) {
            oos.writeObject(object);
            return true;
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }

    }

    public static byte[] readBytes( String filename) throws Exception{
        File file = new File(filename);
        try(FileInputStream fileInputStream = new FileInputStream(file);){
            byte[] bytesArray = new byte[(int) file.length()];

            //read file into bytes
            fileInputStream.read(bytesArray);
            return bytesArray;
        }
    }

    public static void writeBytes(String filename,byte[] data) throws IOException {
        FileOutputStream fop = new FileOutputStream(filename);
        fop.write(data);
        fop.flush();
        fop.close();
        System.out.println("Done");
        
    }
}
