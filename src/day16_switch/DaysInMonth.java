package day16_switch;

import java.util.Scanner;

public class DaysInMonth {

    public static void main(String[] args) {
        /*
        add new class DaysInMonth (redo)
add a main method

Write a program that will accept a month name and output how many days are in that month

    February: 28 days
    April, June, September, November: 30 days
    January, March, May, July, August, October, December: 31 days

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter month");

        int days = 0;

        switch (input.next()){
            case "February":
                days = 28;
                break;
            case "April":
            case "November":
            case "June":
            case "September":

                days = 30;
                break;
            case "January":
            case "March":
            case "May":
            case "July":
            case "August":
            case "October":
            case "December":
                days = 31;
                break;
            default:
                System.out.println("No such month, try again!");



        }
        if(days != 0) {
            System.out.println(days + " days");
        }

    }
}
