package day16_switch;

import java.util.Scanner;

public class SeasonFinder {

    public static void main(String[] args) {
        /*
        add new class SeasonFinder
add a main method

Given some month number determine which season it is

Winter: 12,1,2
Spring: 3,4,5
Summer: 6,7,8
Fall:   9,10,11

    Ex:
    when month = 2;
        OUTPUT:
            "Winter"

    when month = 7;
        OUTPUT:
            "Summer"

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter month number to find out what season it is");
        int monthNumber = input.nextInt();

        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println(monthNumber + " is Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + " is Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + " is Spring ");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + " is Fall");
                break;

            default:
                System.out.println("Unknown month number;)");
        }





    }
}
