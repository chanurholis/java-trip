package example_project;

import java.util.Scanner;

import example_project.packages.Example.Aselole;

class Package {
    public static void main(String[] args) {
        try (Scanner myObj = new Scanner(System.in)) {
            System.out.print("Enter username : ");
            String userName = myObj.nextLine();
            System.out.println("Username is: " + userName);
        }

        Aselole.main();
    }
}