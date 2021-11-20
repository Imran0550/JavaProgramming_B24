package day01_MyPractice;

import java.util.Scanner;

public class Practicce {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a name");
        String name = scan.next();

        String a = name.substring(0,1).toUpperCase();
        System.out.println(a);

    }

}


