package day19_string;

import java.util.Locale;
import java.util.Scanner;

public class FixNameChaining {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name");
        String name = input.nextLine().trim().toLowerCase();
        System.out.println("Enter your last name");
        String lastName = input.nextLine().trim().toLowerCase();

        System.out.println(name);
        System.out.println(lastName);

        String fixedFirstName = name.substring(0,1).toUpperCase() + name.substring(1);
        String fixedLastName = lastName.substring(0,1).toUpperCase()+ lastName.substring(1);
        System.out.println(fixedFirstName + " " + fixedLastName);
        System.out.println();







    }
}
