package day10_scanner;

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {

        /*
                Ask the user to enter a number. Check if that number is evenly divisible by 2, 3, and 5. Print the boolean values

    Ex:
    Enter a number
    65

    65 is divisible by 2: false
    65 is divisible by 3: false
    65 is divisible by 5: true
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int num1 = input.nextInt();

        boolean isDivisibleBy2 = num1 % 2 == 0;
        boolean isDivisibleBy5 = num1 % 5 == 0;
        boolean isDivisibleBy3 = num1 % 3 == 0;

        System.out.println(num1  + " is divisible by 2:"+ isDivisibleBy2);
        System.out.println(num1 + " is divisible by 5:" + isDivisibleBy5);
        System.out.println(num1 + " is divisible by 3:" + isDivisibleBy2);










    }
}
