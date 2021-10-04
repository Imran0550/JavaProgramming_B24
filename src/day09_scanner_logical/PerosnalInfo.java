package day09_scanner_logical;

import java.util.Scanner;

public class PerosnalInfo {

    public static void main(String[] args) {
        //Ask the user to enter their age (byte),
        //ask them to enter their favorite number (long),and ask them if they are a student (boolean).Print all the //values from the inputs

        Scanner input = new Scanner(System.in);

        System.out.println("Your age:");
        byte age = input.nextByte();

        System.out.println("Your favourite number:");
        long favouriteNumber = input.nextLong();

        System.out.println("Are you a student:");
        boolean areYouAStudent = input.hasNextBoolean();





    }
}
