package day18_string;

import java.util.Locale;

public class MoreStringMethods {
    public static void main(String[] args) {

        String s = "     Apples are    ";
        System.out.println(s.trim());


        String s2 = "        ";
        System.out.println(s2.trim()); // removes all the spaces

        String s3 = "";
        System.out.println(s3.isEmpty());

        String s4 = " ";
        System.out.println(s4.length());
        System.out.println(s4.isEmpty());

        String s5 = "5";
        System.out.println(s5.isEmpty());
        System.out.println(s5.length());

        String s6 = "    khan     ";
        System.out.println(s6.trim());
        System.out.println(s6.isEmpty());


        String s7 = "javaScript";
        System.out.println(s7.startsWith("java"));
        System.out.println(s7.startsWith("Java"));



        System.out.println();

        String s8 = " jump";
        System.out.println(s8.startsWith("j"));
        System.out.println(s8.startsWith(" j"));

        System.out.println();

        String s9 =  "maker";
        System.out.println(s9.endsWith("ker"));
        System.out.println(s9.endsWith("erk"));

        if(s9.endsWith("ker")){
            System.out.println("Thank you");

        }

        System.out.println();
        String s10 = "Walmart";
        System.out.println(s10.equals("Walmart"));
        if(s10.equals("Walmart")){
            System.out.println("Saim is a great instructor");
        }

    }
}
