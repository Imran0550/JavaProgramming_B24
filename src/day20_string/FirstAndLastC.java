package day20_string;

import java.util.Locale;
import java.util.Scanner;

public class FirstAndLastC {
    public static void main(String[] args) {

        /*
        find the first and last character of a word.
         */

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = s.next().toUpperCase();
        // first we need to find the last character.



        int countOfCharacters = word.length();
        int lastCharacter = countOfCharacters - 1; // -1 is the formula for finding the last character in String.
        char lastC = word.charAt(lastCharacter);

        System.out.println(word.charAt(0) + "" + lastC);
        System.out.println(word);

    }
}
