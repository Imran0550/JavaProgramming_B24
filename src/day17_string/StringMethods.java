package day17_string;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {

        String name = "james";
        System.out.println(name.equals("james"));// true

        System.out.println(name.equals("James"));// false

        System.out.println(name.equalsIgnoreCase("james")); // true
        System.out.println(name.equalsIgnoreCase("JAmes"));

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        System.out.println(name);

        String lastName = "bond";
       lastName = lastName.toUpperCase();// reassigned here;
        System.out.println(lastName);

        System.out.println(lastName.toLowerCase()); // bond
        System.out.println(lastName);

        String word= "Imran";
        int lenght = word.length();
        System.out.println("Imran has " + lenght + " words");
        System.out.println(word.toUpperCase(Locale.ROOT));// print the name in all upper case
        System.out.println(word.toLowerCase());// prints the name in all lower case
        System.out.println(word.equalsIgnoreCase("ImrAN"));// dosen't care about if the word are upper case or lower case the outcome will be true.

        System.out.println(name.equalsIgnoreCase("jamEs"));



    }
}
