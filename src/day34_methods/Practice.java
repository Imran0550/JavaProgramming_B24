package day34_methods;

import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your car make");
        String make = input.next();
        carMake(make);
    }
    public static void carMake(String make){
        System.out.println("Hello my car make is " + make + " let me know if you need anything else.");
    }


}
