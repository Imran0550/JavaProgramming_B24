package day04_variables;

public class Fruits {
    public static void main(String[] args) {

        int apples = 10;
        int grapes = 16;
        int bananas = 20;

        System.out.println("Number of apples: " + apples);
        System.out.println(" Number of grapes:" + grapes);
        System.out.println("Number of bananas:" + bananas);

        int totalNumberOfFruits= apples + grapes + bananas;

        System.out.println("total number of fruits = " + totalNumberOfFruits);

        // soutv -> shourtcut to print variables

        // we have a new shipment and then we have 50 apples
          apples = 50; // reassigned the apples variables to have a value of 50
          totalNumberOfFruits = apples + grapes + bananas; // reassinged and counted again

        System.out.println( "\nAfter shipment");
        System.out.println("Number of apples: " + apples);
        System.out.println(" Number of grapes:" + grapes);
        System.out.println("Number of bananas:" + bananas);
        System.out.println("Total number of fruits:" + totalNumberOfFruits );


    }
}
