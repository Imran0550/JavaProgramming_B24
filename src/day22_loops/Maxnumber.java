package day22_loops;

import java.util.Scanner;

public class Maxnumber {
    public static void main(String[] args) {

        /*
        write a program that asks user to enter 5 numbers and returns the maximum number
         */

        Scanner s = new Scanner(System.in);

        int counter = 1;
        int max = -2147483648;

        while (counter<=5){
            counter ++;

            System.out.println("Enter a number");
            int number = s.nextInt();

            if(number > max){
                max = number;
            }
        }
        System.out.println("max: " + max);
    }
}
