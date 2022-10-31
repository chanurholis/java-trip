package java_file_handling;

import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;

public class CreateFileExample {
    public static void main(String[] args) {
        try {
           writeLorem("filename.txt");
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    public static void writeLorem(String filename) {
        try {
            // check file
            checkFile(filename);
            FileWriter myFile = new FileWriter(filename);
            myFile.write("lorem ipsum aselole");
            myFile.close();
            System.out.println(filename + " successfully updated!");
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    public static void checkFile(String filename) {
        try {
            File myFile = new File(filename);
            if (!myFile.exists()) {
                throw new FileNotFoundException("File not found!");
            }
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
