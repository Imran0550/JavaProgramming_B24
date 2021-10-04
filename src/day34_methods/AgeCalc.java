package day34_methods;

import java.util.Scanner;

public class AgeCalc {
    public static void main(String[] args) {

        getAge(2000);

        getAge(1990);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your birth year");
        int year = input.nextInt();
        getAge(year);

        System.out.println("Enter your birth year");
        int year2 = input.nextInt();
        age(year2);


    }

    public static void getAge (int year){
        System.out.println("your age in 2021 is");
        System.out.println(2021 - year);
    }
    public static void age (int year){
        System.out.println("Your are now:");
        System.out.println(2021 - year);
    }
}
