package day32_array;

import java.util.Arrays;
import java.util.Locale;

public class Anagram {
    public static void main(String[] args) {

        /*

         What is anagram
            2 words are anagram if they are built up of the same character

          Ex:
            abc
            cba

         */
        String one = "listen";
        String two = "silent";

       // conver String to char arrays, to be able to compare each character

        char [] oneArr = one.toCharArray();
        char [] twoArr = two.toCharArray();

        // sort the characters in order

        Arrays.sort(oneArr);
        Arrays.sort(twoArr);

        System.out.println("Is anagram " + Arrays.equals(oneArr, twoArr));







    }
}
