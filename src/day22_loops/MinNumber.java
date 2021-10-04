package day22_loops;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {


        /*
        write a program that asks user to enter 5 numbers and returns the minimum number
         */
        Scanner input = new Scanner(System.in);

        int counter = 1;
        int min = 2147483647;

        while(counter <= 5){
            counter ++;

            System.out.println("Enter a number");
            int number = input.nextInt();

            if(number < min){
                min = number;

            }

        }
        System.out.println("min: " + min);

    }
}
