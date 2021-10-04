package day24_loops;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
         /*
         String from user

         reverse the String

         i can use a loop to get indexes backwards

         i use those reverse index with charAt
             -> read chars backwards

          concat to another String

        reverse String is equal to my original String
          */
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = input.next();
        String reverse = "";

        for(int index = word.length() -1; index >=0; index--){
            reverse += word.charAt(index);

        }
        if(word.equals(reverse)){
            System.out.println("palindrome");
        }
        System.out.println(reverse);
        System.out.println();

        System.out.println("Enter a word2");
        String word2 = input.next();
        String reverse2 = "";

        for (int i = word2.length()-1; i >=0; i--){
            reverse2 += word2.charAt(i);
        }
        System.out.println(reverse2);

        System.out.println("Enter a word3");
        String word3 = input.next();
        String reverse3 = "";

        for(int d= word3.length() -1; d >= 0; d--){
            reverse3 += word3.charAt(d);
        }
        // my own practice;



        for(int x = 1; x <= 10; x++){
            System.out.println("Multiplication of "+ x);
            for(int f =1; f <= 10; f++){
                System.out.println(x + " X " + f + " = " + (x*f));
            }
            }


        }




}
