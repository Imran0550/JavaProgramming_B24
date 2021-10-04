package day15_switch;

import java.util.Scanner;

public class Starbucks {
    public static void main(String[] args) {
        /*
        coffee
        tall, venti, grande
        price
        calories amount
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Starbucks");
        System.out.println("What size you you like");
        String size = input.next();

        double price = 0;
        int colories = 0;
        boolean validOrder = true;

        switch(size){
            case "tall":
                price = 3.50;
                colories = 100;
                break;
            case "grande":
                price = 4.50;
                colories = 150;
                break;
            case "venti":
                price = 5.50;
                colories = 200;
                break;
            default:
                System.out.println("we don't serve that size");
                validOrder = false;







        }
        if(validOrder) {
            System.out.println("your order was: " + size);
            System.out.println("Your total is: $" + price);
            System.out.println("Total colories: " + colories);
        } else {

        }





    }
}
