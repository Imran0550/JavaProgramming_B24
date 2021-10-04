package day09_scanner_logical;

import java.util.Scanner;

public class Revenue {

    public static void main(String[] args) {
        // Ask the user to enter product price and quantity and then calculate the revenue

        Scanner input = new Scanner(System.in);
        System.out.println("Product price:");
        double productPrice = input.nextDouble();

        System.out.println("Product quantity:");
        int productQuantity = input.nextInt();

       double revenue =  productPrice * productQuantity;

        System.out.println("Revenue: " + "$" + revenue);
    }
}
