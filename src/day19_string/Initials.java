package day19_string;

import java.util.Locale;
import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        /*
        Ask the user to enter their first name
        Ask the user to enter their last name
        Then print the initials
          James Bond -> JB

          bouns: give the initials as uppercase
         */

        System.out.println("first name");
        String firstName = input.next();
        System.out.println("Last Name");
        String lastName = input.next();
        String initials = "" + firstName.charAt(0) + lastName.charAt(0);

        System.out.println(initials.toUpperCase(Locale.ROOT));


    }
}
