package day09_scanner_logical;

import java.util.Scanner;

public class AddNumberPractice {
    public static void main(String[] args) {

        /*
          Enter four numbers
         */

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter your Numbers");

        int num1 = keyboard.nextInt();
        int num2 = keyboard.nextInt();
        int num3 = keyboard.nextInt();
        int num4 = keyboard.nextInt();


        String summary = num1 + " + " + num2 + " + " + num3 + " + " + num4 + " = ";
        System.out.print( summary + (num1 + num2 + num3 + num4));





    }
}
