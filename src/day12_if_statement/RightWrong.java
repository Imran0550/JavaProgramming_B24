package day12_if_statement;

import java.util.Scanner;

public class RightWrong {
    public static void main(String[] args) {
        /*
        Write a program that will accept a boolean value. Print out the opposite of the given booleanEx: true -> false false -> true
         */
        Scanner input = new Scanner(System.in);

        boolean s = input.nextBoolean();

        if(s == true){
            System.out.println("false");
        } else if(s == false){
            System.out.println("true");
        }


    }
}
