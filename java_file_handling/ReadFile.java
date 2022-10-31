package java_file_handling;

import java.io.File;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        try {
            File myFile = new File("filename.txt");
            getFileInformation(myFile);
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void getFileInformation(File file) {
        if (file.exists()) {
            System.out.println("File name: " + file.getName());
            System.out.println("Absolute path: " + file.getAbsolutePath());
            System.out.println("Writeable: " + file.canWrite());
            System.out.println("Readable " + file.canRead());
            System.out.println("File size in bytes " + file.length());
          } else {
            System.out.println("The file does not exist.");
          }
    }
}
