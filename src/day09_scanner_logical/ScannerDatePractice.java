package day09_scanner_logical;

import java.util.Scanner;

public class ScannerDatePractice {
    public static void main(String[] args) {

        /*
        write today's date
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter month:");

        int month = input.nextInt();

        System.out.println("Enter day:");

        int day = input.nextInt();

        System.out.println("Enter year:");

        int year = input.nextInt();

        System.out.println("Full Date:" + month + "/" + day  + "/" + year);
    }

}
