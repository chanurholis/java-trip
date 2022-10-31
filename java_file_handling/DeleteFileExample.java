package java_file_handling;

import java.io.File;

public class DeleteFileExample {
    public static void main(String[] args) {
        File myFile = new File("delete.txt");
        if (myFile.delete()) {
            System.out.println("Deleted file : " + myFile.getName());
        } else {
            System.out.println("Failed to delete the file!");
        }

        // delete example folder
        deleteExampleFolder();
    }

    public static void deleteExampleFolder() {
        File myFolder = new File("/Users/chanur/Workspaces/JAVA/java-trip/example");
        if (myFolder.delete()) {
            System.out.println("Deleted the folder: " + myFolder.getName());
        } else {
            System.out.println("Failed to delete the folder.");
        }
    }
}
