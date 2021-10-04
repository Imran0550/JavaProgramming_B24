package day34_methods;

import java.util.Scanner;

public class GreetingMethod {

    /*

     method that will have the String parameter for the name

     Hello name, how are your

     */

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter you name");
        String name = input.next();
        Greeting(name);
    }

    public static void Greeting(String name){
        System.out.println("Hello " + name + " , how are you");

    }
}
