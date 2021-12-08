package day01_MyPractice.replit;

import java.time.temporal.ChronoField;

public class ReverseWithoutSpecialChars {

    public static String reverseNoSpec(String str) {


        String result = "";


        for (int i = str.length() - 1; i >= 0; i--) {


            result += str.charAt(i);


        }

        return result;
    }

    public static void main(String[] args) {
        String s = "a,b$c";

        System.out.println(reverseNoSpec(s));
    }
}
