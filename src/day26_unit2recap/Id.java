package day26_unit2recap;

import java.util.Scanner;

public class Id {
    public static void main(String[] args) {

        /*
        Create ID [String]Given a first name and last name create and return an id using the following format:the first letter of the first name as lowercase,the first 3 letters of the last name with the first letter as uppercase and the rest lowercase,the length of the first String multiplied by 2first name: johnlast name: smithid: jSmi8
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your fist name");
        String firsName = input.nextLine().toLowerCase();
        System.out.println("Enter your last name");
        String lastName = input.nextLine();
        String id = "";
        String id2 = "";
        int first = firsName.length() * 2;

       id = firsName.substring(0,1);
       id2 = lastName= lastName.substring(0,3);
       id2= lastName.substring(0,1).toUpperCase() + lastName.substring(1) + first;


        System.out.println("ID: " + id + id2 );

    }
}
