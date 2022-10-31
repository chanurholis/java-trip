package java_how_to;

import java.util.Scanner;

public class AddTwoNumbers {
    public static int x, y, sum;

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("Type a number : ");
        x = myScanner.nextInt();

        System.out.println("Type another number : ");
        y = myScanner.nextInt();
        myScanner.close();

        sum = x + y;
        System.out.println("Sum is : " + sum);
    }
}
