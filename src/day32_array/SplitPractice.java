package day32_array;

import java.util.Scanner;

public class SplitPractice {
    public static void main(String[] args){

        //String input: 3 words
        // reverse the middle word

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.nextLine();


        String [] words = word.split(" ");

        String reverse = " ";
        for(int i = words[1].length()-1; i >=0; i--){
            reverse += words[1].charAt(i);
        }
        System.out.println(words [0] + " " + reverse + " " + words[2]);

        // my own practice

        // reverse the last word

        System.out.println();

        System.out.println("Enter word 2");
        String word2 = input.nextLine();

        String [] words2 = word2.split(" ");
        String reverse2 = " ";

        for(int i = words2[2].length()-1;i >=0; i--){
            reverse2 += words2[2].charAt(i);
        }
        System.out.println(words2[0] + " " + words2[1] + " " + reverse2);

        System.out.println();

        // reverse the first word

        System.out.println("Enter word 3");
        String word3 = input.nextLine();

        String [] words3 = word3.split(" ");
        String reverse3 = " ";

        for(int i = words3[0].length()-1;i>=0;i--){
            reverse3 += words3[0].charAt(i);
        }
        System.out.println(reverse3 + " " + words3[1] + " " + words3[2]);

        // reverse the whole word;

        System.out.println();
        System.out.println("Enter a word u want to reverse");
        String word5 = input.nextLine();

        String reverseW = " ";

        for(int i = word5.length()-1; i >=0; i--){
            reverseW += word5.charAt(i);
        }
        System.out.println(reverseW);

        System.out.println();

        System.out.println("Enter  a word and reverse the first and middle character");
        String word6 = input.nextLine();

        String word0 [] = word6.split(" ");

        String reverse6 = " ";

        for(int i= word0[0].length()-1; i >=0; i-- ){

            reverse6+= word0[0].charAt(i);
        }


        for(int i = word0[1].length()-1; i>=0;i--){

            reverse6 +=" "+ word0[1].charAt(i);
        }

        System.out.println(reverse6 + " " + word0[2]);


    }
}
