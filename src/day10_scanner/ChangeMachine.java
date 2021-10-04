package day10_scanner;

import java.util.Scanner;

public class ChangeMachine {

    public static void main(String[] args) {
         /*

quarters
    dimes
    nickels
    pennies
[12:58 PM]
Change machine
Ask the user to enter some number from 1-99

    quarters
    dimes
    nickels
    pennies


Ex:
    80

    3 quarters
    0 dimes
    1 nickels
    0 pennies


Hint: use %
          */

        Scanner input = new Scanner(System.in);

        int cents, quarters, dimes, nickles, pennies;

        System.out.println("Hello, welcome to the change machine");
        System.out.println("Please enter your cents from 1-99");

        cents = input.nextInt(); // 83

        quarters = cents / 25; // 83 /25 -> 3 | 83 - 75 = 8
        cents %= 25; // 8
        dimes = cents / 10; // 8 / 10
        cents %= 10; // 8 % 10 -> 8
        nickles = cents / 5; // 8 /5 -> 1 | 8 -5 => 3

        cents %= 5; // 3

        pennies = cents;

        System.out.println("your change is: ");
        System.out.println("quarters: " + quarters);
        System.out.println(" dimes: " + dimes);
        System.out.println("nickles: " + nickles);
        System.out.println("pennies " + pennies);







    }
}
