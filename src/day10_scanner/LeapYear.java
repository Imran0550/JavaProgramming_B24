package day10_scanner;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        /*

        create a class LeapYear
create a main method
create a Scanner object

Ask the user to enter a year. Determine if the year is a leap year or not. You can assume a leap year is a year that is divisible by 4. Print true or false.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year = input.nextInt();

        boolean isALeapYear = year % 4 == 0;
        System.out.print("Is leap year: " + isALeapYear);









    }

}
