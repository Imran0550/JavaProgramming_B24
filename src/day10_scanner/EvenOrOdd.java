package day10_scanner;

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        //Ask the user to enter an int number, print if the number is even or odd as boolean values

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();

        boolean isEven = a % 2 == 0;
        boolean isOdd = a % 2 !=0;

        System.out.println(a + " is even: " + isEven);
        System.out.println(a + " is odd: " + isOdd);




    }
}
