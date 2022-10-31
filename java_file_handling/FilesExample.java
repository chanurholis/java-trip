package java_file_handling;

import java.io.File;

public class FilesExample {
    public static void main(String[] args) {
        File myFile = new File("lorem.txt");
        
        // method exists from file
        // myFile.canRead();

        // myFile.canWrite();

        // myFile.createNewFile(true);

        System.out.println(myFile.getName());

        System.out.println(myFile.length());
    }
}
