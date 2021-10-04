package day09_scanner_logical;

import java.util.Scanner;

public class YourName {

    public static void main(String[] args) {

        /*

         Ask the user to enter their first name
         Ask the user to write their last name
         print full name
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String firstName = input.next();


        System.out.println("Enter your last name:");
        String lastName = input.next();

        System.out.println("Your full name:" + firstName + " "  + lastName);



    }
}
