package day16_switch;

import java.util.Scanner;

public class NumberInWords {

    public static void main(String[] args) {

/*
add new class NumberInWords
add a main method

Write a program that will display the given number in its word form. Create for numbers 1-10. Any other number is invalid data
    Ex:
        input: 1
        output: one

        input: 5
        output: five
 */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your number");
        int number = input.nextInt();
        String word = "";

        switch(number){
            case 1: word = "one"; break;
            case 2: word = "two"; break;
            case 3: word = "Three"; break;
            case 4: word = "Four"; break;
            case 5: word = "Five"; break;
            case 6: word = "Six"; break;
            case 7: word = "Seven"; break;
            default: word = "Invalid number";

        }
        System.out.println(number);
        System.out.println(word);

    }
}
