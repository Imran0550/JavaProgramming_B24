package day19_string;

public class SubStringExample {
    public static void main(String[] args) {
        /*

           Substring allows you to take part of the String based on the given index number.

           when you give one number, that is that starting of your substring and it keeps all the the characters untill the end.
         */

        String s = "javascript";

        System.out.println(s.substring(1));// cutting the first word, keeping the rest.
        System.out.println(s.substring(2));// cutting the second word, keeping the rest.
        System.out.println(s.substring(4));
        System.out.println(s.substring(5));

        System.out.println(s.substring(0,4));
        System.out.println(s.substring(4));
        System.out.println(s.substring(2, 6));

        String name = "Imran";
        System.out.println(name.substring(0));

        // my own practice

        String name2 = "imran";
        String lName = "khan";
        // make the first two letter of first name upper case and middle of last name to uppercase.

        String nameU = name2.substring(0,2).toUpperCase() + name2.substring(2).toLowerCase();

        System.out.println(nameU);
    }
}
