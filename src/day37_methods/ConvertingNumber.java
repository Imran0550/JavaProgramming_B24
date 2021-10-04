package day37_methods;

import java.util.Scanner;

public class ConvertingNumber {
    public static void main(String[] args) {
        System.out.println(convertNumberToWord(5));
        System.out.println(convertNumberToWord(11));

    }




    public static String convertNumberToWord(int n) {

        if(n <= 0 || n > 10){
            return "Out of range";
        }

        String [] word = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
        return word[n -1];


    }
}
