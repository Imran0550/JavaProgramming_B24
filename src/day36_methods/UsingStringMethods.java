package day36_methods;


import my_utilities.StringUtil;

import java.util.Scanner;

public class UsingStringMethods {

    public static void main(String[] args) {
        System.out.println(StringUtil.reverse("Java"));

        System.out.println(StringUtil.reverse("Soft skills"));

        String s = "racecar";
        String reverse = StringUtil.reverse(s);
        System.out.println(reverse);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter some words to reverse");
        System.out.println(StringUtil.reverse(scan.nextLine()));

        System.out.println("Enter your first name");
        System.out.println(StringUtil.fixFormat(scan.next()));

        System.out.println("Enter your last name");
        System.out.println(StringUtil.fixFormat(scan.next()));
    }
}
