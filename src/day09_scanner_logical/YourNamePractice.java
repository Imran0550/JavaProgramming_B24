package day09_scanner_logical;

import java.util.Scanner;

public class YourNamePractice {

    public static void main(String[] args) {
        /*

        write your full name
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name: ");

        String firstName = input.next();

        System.out.println("Enter your last name");

        String lastName = input.next();

        String fullName = "Your full name is: " + firstName + " " + lastName;

        System.out.println(fullName);
    }
}
