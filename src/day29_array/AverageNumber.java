package day29_array;

import java.util.Scanner;

public class AverageNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many number you want to enter");
        int size = input.nextInt();

        int [] nums = new int[size];

        for(int i = 0; i < size; i++){
            System.out.println("Enter a number " + (i + 1));
            nums[i] = input.nextInt();
        }


       // int [] nums = {4, 6, 2, 10};
        double sum  = 0;

        for(int i =0; i < nums.length; i++){
            sum += nums[i];
        }
        System.out.println("Average number is: " + (sum / nums.length));
    }

}
