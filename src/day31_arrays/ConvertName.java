package day31_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ConvertName {

    /*
    Ask the user to enter their name
    Display each character as an array
     */
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("enter your name");
        String name = scan.next();

        char [] name2 = name.toCharArray();



        System.out.println(Arrays.toString(name2));
        System.out.println(name2[0]);
        System.out.println(name2[name2.length -1]);
    }
}
