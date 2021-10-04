package day31_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args) {

        /*
        Ask the user to enter a sentence


        reverse your sentence

        Ex:
            today is wednesday

            output:

            wednesday is today
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence = scan.nextLine();

        String [] word = sentence.split(" ");
        String reverse = "";

        for(int i = word.length -1; i >=0; i--){
            reverse += word[i] + " ";
        }
        System.out.println(reverse.trim());






    }
}
