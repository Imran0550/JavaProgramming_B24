package officeHours.practice_09_09_2021;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class EmailGenerator {


    public static void main(String[] args) {

        /*

         ask how many email they want to make

          ask the user to enter last name
          -> all lowercase
          ask the user to enter first name
              -> first letter uppercase, the rest lowercase
              -> first three letter of the first name

              ask the user to enter their favorite number
                -> the number * last name length

                email format = last name + . + first name + number + .gmail.com

                store the email into an array.
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("How many emails you want to enter");
        int size = scan.nextInt();

        String [] email = new String[size];

        for(int i = 0; i < size; i++){
            System.out.println("Please enter your last name");
            String lastName = scan.next().toLowerCase();

            System.out.println("Please enter your first name");
            String firstName = scan.next().toLowerCase();
            firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1,3);

            System.out.println("Enter your favorite number");
            int favNum = scan.nextInt() *
                    lastName.length();

            email[i] = lastName + "." + firstName + favNum + "@gmail.com";





        }
        System.out.println(Arrays.toString(email));
    }
}
