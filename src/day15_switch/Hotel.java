package day15_switch;

import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the java hotel");
        System.out.println("How many people in your party");

        int numberOfPeople = input.nextInt();
        System.out.println("How many days will you stay");

        int numberOfDays = input.nextInt();
        double price = 0;
        String roomType =  "";
        boolean validNumberOfPeople = true;

        switch(numberOfPeople){
            case 2:
                price = numberOfDays * 50;
                roomType = "Single Room";
                break;
            case 8:
                price = numberOfDays * 300;
                roomType = "Double Room";
                break;
            case 10:
                price = numberOfDays * 500;
                roomType = "Double Room";
                break;
            case 4:
            case 6:
                price = numberOfDays * 450;
                roomType = "Large room";
                break;

            default:
                System.out.println("Sorry, don't have enough space for that much people");
                validNumberOfPeople = false;


        }

        if(validNumberOfPeople) {

            System.out.println("you have " + numberOfPeople + " people and you wanna stay here for " + numberOfDays + " days.");
            System.out.println("So you total is: $" + price);
            System.out.println("The room type for this much people is " + roomType);
        }



    }
}
