package day31_arrays;

import java.util.Arrays;

public class CharArrays {
    public static void main(String[] args) {

        char [] letters = {'j', 'a', 'v', 'a'};

        // how to convert a String to a char array

        String s = "java";

        char [] java = s.toCharArray();


        System.out.println(Arrays.toString(letters));
        System.out.println(Arrays.toString(java));

        // my practice

        char [] letters2 = {'i', 'm', 'r', 'a', 'n'};

        String d = "imran";

        char [] name = d.toCharArray(); // here we change the String to char array.
        System.out.println(Arrays.toString(name));
        System.out.println(Arrays.toString(letters2));



    }
}
