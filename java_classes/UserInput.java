import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        // code ...

        try (Scanner myScanner = new Scanner(System.in)) {
            System.out.print("Whats is your name? ");

            String name = myScanner.nextLine();
            System.out.println("\nmy name is : " + name);
        }
    }
}
