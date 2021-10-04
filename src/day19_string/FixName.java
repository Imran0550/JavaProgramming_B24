package day19_string;

import java.util.Locale;
import java.util.Scanner;

public class FixName {
    public static void main(String[] args) {

        /*
        Ask the user to enter their first name
        Ask the user to enter their last name

        Maker sure the name is properly formatting

        each first letter of both name is capital and the rest are lowercase
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name");
        String name = input.next();
        System.out.println("Enter your last name");
        String lastName = input.next();
         name = name.toUpperCase(Locale.ROOT).charAt(0) + name.toLowerCase(Locale.ROOT).substring(1);
         lastName = lastName .toUpperCase(Locale.ROOT).charAt(0) + lastName .toLowerCase(Locale.ROOT).substring(1);

        System.out.println(name + " " + lastName);
    }
}
