package day11_if_statements;

import java.util.Scanner;

public class OxygenLevel {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is your oxygen level");

        int above = input.nextInt();

        if (above == 90) {
            System.out.println("Your tank is full");

        }

        if (above == 80) {
            System.out.println("still okay");
        }

        if (above == 70) {
            System.out.println("Don't go too far");

        }

        if(above == 60) {
            System.out.println("Start go ahead back");
        }

        if(above == 50) {
            System.out.println("Be careful now you at 50%");
        }


        }


    }


