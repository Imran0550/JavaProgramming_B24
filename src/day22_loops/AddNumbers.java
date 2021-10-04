package day22_loops;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sum = 0;
        boolean posNumber = true;
        while(posNumber){
            System.out.println("Enter a number");
            int number = input.nextInt();


            if(number < 0){
                posNumber = false;
            }else{
                sum += number; // sum = sum + number
            }


        }
        System.out.println("sum: " + sum);

    }

}
