package day01_MyPractice;

import java.awt.*;

public class FizzBuzz {


    public static void fizzBuzz(int [] arr){



        for(int each : arr){
            if(each %3==0 && each%5==0){
                System.out.println("FizzBuzz");
            }else if(each%5==0){
                System.out.println("Buzz");
            }else if(each%3==0){
                System.out.println("Fizz");
            }else {
                System.out.println(each);
            }
        }


    }

    public static void main(String[] args) throws AWTException {
        int [] arr1 = {1,5,4,10,15,30,5,2,3};

        fizzBuzz(arr1);

        String word = "Crops Corporation";

        System.out.println(reverse(word));
    }

    public static String reverse(String str1){
        String rev = "";

        for(int i= str1.length()-1;i>=0;i--){
            rev += str1.charAt(i);
        }

        return rev;

    }
}
