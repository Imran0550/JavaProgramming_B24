package day34_methods;

import java.util.Arrays;
import java.util.Scanner;

public class CreateMultiArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String [][] allWords = new String[3][];


        // today is sunday
        System.out.println("Enter a your first set of word");
        allWords[0] = input.nextLine().split(" ");

        System.out.println("Enter you second set of words");
        String word = input.nextLine();
        String [] arr = word.split(" ");
        allWords[1] = arr;

        System.out.println("Enter you last set of words");
        allWords[2] = input.nextLine().split(" ");

        System.out.println(Arrays.deepToString(allWords));



    }
}
